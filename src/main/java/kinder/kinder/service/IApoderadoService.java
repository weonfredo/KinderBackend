package kinder.kinder.service;

import java.util.List;
import java.util.Optional;

import kinder.kinder.entity.Apoderado;

public interface IApoderadoService {
	
	List<Apoderado> buscarTodos();
	void guardar(Apoderado apoderado);
	void modificar(Apoderado apoderado);
	Optional<Apoderado> buscarId(Integer id);
	void eliminar(Integer id);


}
