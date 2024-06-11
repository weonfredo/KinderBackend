package kinder.kinder.service;

import java.util.List;
import java.util.Optional;

import kinder.kinder.entity.Alumno;
import kinder.kinder.request.AlumnoRequest;

public interface IAlumnoService {
	
	List<Alumno> buscarTodos();
	void guardar(AlumnoRequest alumno);
	void modificar(AlumnoRequest alumno);
	Optional<Alumno> buscarId(String dni);
	void eliminar(Integer id);

}
