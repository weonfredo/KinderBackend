package kinder.kinder.service;

import java.util.List;
import java.util.Optional;

import kinder.kinder.entity.Perfil;

public interface IPerfilService {
	List<Perfil> buscarTodos();
	void guardar(Perfil perfil);
	void modificar(Perfil perfil);
	Optional<Perfil> buscarId(Integer id);
	void eliminar(Integer id);
}
