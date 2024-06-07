package kinder.kinder.service;

import java.util.List;
import java.util.Optional;

import kinder.kinder.entity.Seccion;

public interface ISeccionService {
	
	
	
	List<Seccion> buscarTodos();
	void guardar(Seccion seccion);
	void modificar(Seccion seccion);
	Optional<Seccion> buscarId(Integer id);
	void eliminar(Integer id);



}
