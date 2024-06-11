package kinder.kinder.service.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kinder.kinder.entity.Alumno;
import kinder.kinder.entity.Apoderado;
import kinder.kinder.entity.Aula;
import kinder.kinder.entity.Grado;
import kinder.kinder.entity.Seccion;
import kinder.kinder.repository.AlumnoRepository;
import kinder.kinder.repository.ApoderadoRepository;
import kinder.kinder.repository.AulaRepository;
import kinder.kinder.repository.GradoRepository;
import kinder.kinder.repository.SeccionRepository;
import kinder.kinder.request.AlumnoRequest;
import kinder.kinder.service.IAlumnoService;

@Service
public class AlumnoService implements IAlumnoService {
	
	@Autowired
	private AlumnoRepository alumnoRepository;
	
	@Autowired
	private AulaRepository aulaRepository;
	
	@Autowired
	private ApoderadoRepository apoderadoRepository;
	
	@Autowired
	private GradoRepository gradoRepository;
	
	@Autowired
	private SeccionRepository seccionRepository;
	
	
	public List<Alumno> buscarTodos(){
		return alumnoRepository.findAll();
	}

	@Override
	public void guardar(AlumnoRequest registro) {
		
		if (alumnoRepository.findByDni(registro.getDni()).isPresent()) {
            throw new IllegalArgumentException("El alumno con DNI " + registro.getDni() + " ya existe.");
        }

        Aula aula = aulaRepository.findByNombre(registro.getAula())
                .orElseThrow(() -> new IllegalArgumentException("Aula no encontrada: " + registro.getAula()));
        Apoderado apoderado = apoderadoRepository.findByDni(registro.getDniApoderado())
                .orElseThrow(() -> new IllegalArgumentException("Apoderado no encontrado: " + registro.getDniApoderado()));
        Grado grado = gradoRepository.findByNombre(registro.getGrado())
                .orElseThrow(() -> new IllegalArgumentException("Grado no encontrado: " + registro.getGrado()));
        Seccion seccion = seccionRepository.findByNombre(registro.getSeccion())
                .orElseThrow(() -> new IllegalArgumentException("Sección no encontrada: " + registro.getSeccion()));

        Alumno alumno = new Alumno();
        alumno.setDni(registro.getDni());
        alumno.setNombres(registro.getNombres());
        alumno.setApellidos(registro.getApellidos());
        alumno.setFecha_nacimiento(registro.getFecha_nacimiento());
        alumno.setSexo(registro.getSexo());
        alumno.setLugar_nacimiento(registro.getLugar_nacimiento());
        alumno.setDireccion(registro.getDireccion());
        alumno.setEstado_financiero(registro.getEstado_financiero());
        alumno.setAula(aula);
        alumno.setApoderado(apoderado);
        alumno.setGrado(grado);
        alumno.setSeccion(seccion);

        alumnoRepository.save(alumno);
		
	}

	@Override
	public void modificar(AlumnoRequest registro) {

        Alumno alumno = alumnoRepository.findByDni(registro.getDni())
                .orElseThrow(() -> new IllegalArgumentException("El alumno con DNI " + registro.getDni() + " no existe."));


        Aula aula = aulaRepository.findByNombre(registro.getAula())
                .orElseThrow(() -> new IllegalArgumentException("Aula no encontrada: " + registro.getAula()));
        Apoderado apoderado = apoderadoRepository.findByDni(registro.getDniApoderado())
                .orElseThrow(() -> new IllegalArgumentException("Apoderado no encontrado: " + registro.getDniApoderado()));
        Grado grado = gradoRepository.findByNombre(registro.getGrado())
                .orElseThrow(() -> new IllegalArgumentException("Grado no encontrado: " + registro.getGrado()));
        Seccion seccion = seccionRepository.findByNombre(registro.getSeccion())
                .orElseThrow(() -> new IllegalArgumentException("Sección no encontrada: " + registro.getSeccion()));


        alumno.setNombres(registro.getNombres());
        alumno.setApellidos(registro.getApellidos());
        alumno.setFecha_nacimiento(registro.getFecha_nacimiento());
        alumno.setSexo(registro.getSexo());
        alumno.setLugar_nacimiento(registro.getLugar_nacimiento());
        alumno.setDireccion(registro.getDireccion());
        alumno.setEstado_financiero(registro.getEstado_financiero());
        alumno.setAula(aula);
        alumno.setApoderado(apoderado);
        alumno.setGrado(grado);
        alumno.setSeccion(seccion);


        alumnoRepository.save(alumno);
    }

	@Override
	public Optional<Alumno> buscarId(String dni) {
		return Optional.ofNullable(alumnoRepository.findByDni(dni)
                .orElseThrow(() -> new IllegalArgumentException("El alumno con DNI " + dni + " no existe.")));
	}

	@Override
	public void eliminar(Integer id) {
	    if (!alumnoRepository.existsById(id)) {
	        throw new IllegalArgumentException("El alumno con ID " + id + " no existe.");
	    }
	    alumnoRepository.deleteById(id);
	}

}
