package kinder.kinder.service;

import java.util.List;
import java.util.Optional;

import kinder.kinder.entity.Grado;
import kinder.kinder.request.GradoRequest;

public interface IGradoService {
	
	List<Grado> buscarTodos();
	void guardar(GradoRequest grado);
	void modificar(GradoRequest grado);
	Optional<Grado> buscarId(Integer id);
	void eliminar(Integer id);

}
