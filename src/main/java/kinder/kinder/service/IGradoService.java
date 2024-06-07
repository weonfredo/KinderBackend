package kinder.kinder.service;

import java.util.List;
import java.util.Optional;

import kinder.kinder.entity.Grado;

public interface IGradoService {
	
	List<Grado> buscarTodos();
	void guardar(Grado grado);
	void modificar(Grado grado);
	Optional<Grado> buscarId(Integer id);
	void eliminar(Integer id);

}
