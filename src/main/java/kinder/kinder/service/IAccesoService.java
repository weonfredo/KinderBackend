package kinder.kinder.service;

import java.util.List;
import java.util.Optional;

import kinder.kinder.entity.Acceso;

public interface IAccesoService {
	List<Acceso> buscarTodos();
	void guardar(Acceso acceso);
	void modificar(Acceso acesso);
	Optional<Acceso> buscarId(Integer id);
	void eliminar(Integer id);
}
