package kinder.kinder.service.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kinder.kinder.entity.Docente;
import kinder.kinder.entity.Usuario;
import kinder.kinder.repository.DocenteRepository;
import kinder.kinder.repository.UsuarioRepository;
import kinder.kinder.request.DocenteRequest;
import kinder.kinder.service.IDocenteService;

import java.util.List;
import java.util.Optional;

@Service
public class DocenteService implements IDocenteService {

    @Autowired
    private DocenteRepository docenteRepository;
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List<Docente> buscarTodos() {
        return docenteRepository.findAll();
    }

    @Override
    public Docente guardar(DocenteRequest registro) {
        if (docenteRepository.findByDni(registro.getDni()).isPresent()) {
            throw new IllegalArgumentException("El docente con DNI " + registro.getDni() + " ya existe.");
        }

        Usuario usuario = usuarioRepository.findById(registro.getId_usuario())
                .orElseThrow(() -> new IllegalArgumentException("Usuario no encontrada: " + registro.getId_usuario()));

        Docente docente = new Docente();
        docente.setDni(registro.getDni());
        docente.setNombres(registro.getNombres());
        docente.setApellidos(registro.getApellidos());
        docente.setDireccion(registro.getDireccion());
        docente.setSexo(registro.getSexo());
        docente.setEmail(registro.getEmail());
        docente.setDireccion(registro.getDireccion());
        docente.setEspecialidad(registro.getEspecialidad());
        docente.setTelefono(registro.getTelefono());
        docente.setEspecialidad(registro.getTituloAcademico());
        docente.setUsuario(usuario);

        docenteRepository.save(docente);
        return docente;
    }

    @Override
    public Docente modificar(DocenteRequest registro) {
        Docente docente = docenteRepository.findByDni(registro.getDni())
                .orElseThrow(
                        () -> new IllegalArgumentException("El docente con DNI " + registro.getDni() + " no existe."));

        Usuario usuario = usuarioRepository.findById(registro.getId_usuario())
                .orElseThrow(() -> new IllegalArgumentException("Aula no encontrada: " + registro.getId_usuario()));

        docente.setDni(registro.getDni());
        docente.setNombres(registro.getNombres());
        docente.setApellidos(registro.getApellidos());
        docente.setDireccion(registro.getDireccion());
        docente.setSexo(registro.getSexo());
        docente.setEmail(registro.getEmail());
        docente.setDireccion(registro.getDireccion());
        docente.setEspecialidad(registro.getEspecialidad());
        docente.setTelefono(registro.getTelefono());
        docente.setEspecialidad(registro.getTituloAcademico());
        docente.setUsuario(usuario);

        docenteRepository.save(docente);
        return docente;
    }

    @Override
    public Optional<Docente> buscarId(Integer id) {
        return docenteRepository.findById(id);
    }

    @Override
    public void eliminar(Integer id) {
        docenteRepository.deleteById(id);
    }

}
