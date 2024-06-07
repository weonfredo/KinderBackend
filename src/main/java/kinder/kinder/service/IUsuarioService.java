package kinder.kinder.service;

import java.util.List;
import java.util.Optional;

import kinder.kinder.entity.Usuario;

public interface IUsuarioService {
	List<Usuario> buscarTodos();
	void guardar(Usuario usuario);
	void modificar(Usuario usuario);
	Optional<Usuario> buscarId(Integer id);
	void eliminar(Integer id);
}
