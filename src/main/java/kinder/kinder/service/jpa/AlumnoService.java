package kinder.kinder.service.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kinder.kinder.entity.Alumno;
import kinder.kinder.repository.AlumnoRepository;
import kinder.kinder.service.IAlumnoService;

@Service
public class AlumnoService implements IAlumnoService {
	
	@Autowired
	private AlumnoRepository alumnoRepository;
	
	public List<Alumno> buscarTodos(){
		return alumnoRepository.findAll();
	}

	@Override
	public void guardar(Alumno registro) {
		alumnoRepository.save(registro);
		
	}

	@Override
	public void modificar(Alumno registro) {
		alumnoRepository.save(registro);
		
	}

	@Override
	public Optional<Alumno> buscarId(Integer id) {
		
		return alumnoRepository.findById(id);
	}

	@Override
	public void eliminar(Integer id) {
		alumnoRepository.deleteById(id);
		
	}

}
