package kinder.kinder.service;

import java.util.List;
import java.util.Optional;

import kinder.kinder.entity.Perfil;

public interface IPerfilService {
	List<Perfil> buscarTodos();
	Perfil guardar(Perfil perfil);
	Perfil modificar(Perfil perfil);
	Optional<Perfil> buscarId(Integer id);
	void eliminar(Integer id);
}
