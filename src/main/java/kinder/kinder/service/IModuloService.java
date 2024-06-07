package kinder.kinder.service;

import java.util.List;
import java.util.Optional;

import kinder.kinder.entity.Modulo;

public interface IModuloService {
	List<Modulo> buscarTodos();
	void guardar(Modulo usuario);
	void modificar(Modulo usuario);
	Optional<Modulo> buscarId(Integer id);
	void eliminar(Integer id);
}
