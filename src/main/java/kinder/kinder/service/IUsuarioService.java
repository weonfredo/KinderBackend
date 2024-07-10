package kinder.kinder.service;

import java.util.List;
import java.util.Optional;

import kinder.kinder.entity.Usuario;
import kinder.kinder.request.UsuarioRequest;

public interface IUsuarioService {
	List<Usuario> buscarTodos();
	Usuario guardar(UsuarioRequest usuario);
	Usuario modificar(UsuarioRequest usuario);
	Optional<Usuario> buscarId(Integer id);
	void eliminar(Integer id);
}
