package kinder.kinder.service;

import java.util.List;
import java.util.Optional;

import kinder.kinder.entity.Turno;

public interface ITurnoService {

	
	List<Turno> buscarTodos();
	void guardar(Turno turno);
	void modificar(Turno turno);
	Optional<Turno> buscarId(Integer id);
	void eliminar(Integer id);




}
