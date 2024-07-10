package kinder.kinder.service.jpa;

import kinder.kinder.entity.Aula;
import kinder.kinder.entity.Grado;
import kinder.kinder.entity.Seccion;
import kinder.kinder.repository.AulaRepository;
import kinder.kinder.repository.GradoRepository;
import kinder.kinder.repository.SeccionRepository;
import kinder.kinder.request.AulaRequest;
import kinder.kinder.service.IAulaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AulaService implements IAulaService {

    @Autowired
    private AulaRepository aulaRepository;

    @Autowired
    private SeccionRepository seccionRepository;

    @Autowired
    private GradoRepository gradoRepository;

    @Override
    public List<Aula> buscarTodos() {
        return aulaRepository.findAll();
    }
    

    @Override
    public Aula modificar(AulaRequest registro) {

        Aula aula = aulaRepository.findByNombre(registro.getNombre())
                .orElseThrow(() -> new IllegalArgumentException("Aula no encontrada: " + registro.getNombre()));

        aula.setNombre(registro.getNombre());
        aula.setDescripcion(registro.getDescripcion());
        aula.setCapacidad(registro.getCapacidad());

        Seccion seccion = seccionRepository.findById(registro.getId_seccion())
                .orElseThrow(() -> new IllegalArgumentException("Sección no encontrada: " + registro.getId_seccion()));

        Grado grado = gradoRepository.findById(registro.getId_grado())
                .orElseThrow(() -> new IllegalArgumentException("Grado no encontrado: " + registro.getId_grado()));

        aula.setSeccion(seccion);
        aula.setGrado(grado);
        aulaRepository.save(aula);
        return aula;
    }

    @Override
    public Optional<Aula> buscarId(Integer id) {
        return aulaRepository.findById(id);
    }

    @Override
    public void eliminar(Integer id) {
        aulaRepository.deleteById(id);
    }


	@Override
	public Aula guardar(AulaRequest registro) {
        Seccion seccion = seccionRepository.findById(registro.getId_seccion())
                .orElseThrow(() -> new RuntimeException("Sección no encontrada con ID: " + registro.getId_seccion()));

        Grado grado = gradoRepository.findById(registro.getId_grado())
                .orElseThrow(() -> new RuntimeException("Grado no encontrado con ID: " + registro.getId_grado()));

        Aula aula = new Aula();
        aula.setNombre(registro.getNombre());
        aula.setDescripcion(registro.getDescripcion());
        aula.setCapacidad(registro.getCapacidad());
        aula.setSeccion(seccion);
        aula.setGrado(grado);


        aulaRepository.save(aula);
        return aula;
	}
}
