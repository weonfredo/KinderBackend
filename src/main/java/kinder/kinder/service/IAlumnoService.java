package kinder.kinder.service;

import java.util.List;
import java.util.Optional;

import kinder.kinder.entity.Alumno;

public interface IAlumnoService {
	
	List<Alumno> buscarTodos();
	void guardar(Alumno alumno);
	void modificar(Alumno alumno);
	Optional<Alumno> buscarId(Integer id);
	void eliminar(Integer id);

}
