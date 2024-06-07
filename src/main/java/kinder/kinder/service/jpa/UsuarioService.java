package kinder.kinder.service.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kinder.kinder.entity.Usuario;
import kinder.kinder.repository.UsuarioRepository;
import kinder.kinder.service.IUsuarioService;

@Service
public class UsuarioService implements IUsuarioService {
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public List<Usuario> buscarTodos(){
		return usuarioRepository.findAll();
	}

	@Override
	public void guardar(Usuario registro) {
		usuarioRepository.save(registro);
		
	}

	@Override
	public void modificar(Usuario registro) {
		usuarioRepository.save(registro);
		
	}

	@Override
	public Optional<Usuario> buscarId(Integer id) {
		
		return usuarioRepository.findById(id);
	}

	@Override
	public void eliminar(Integer id) {
		usuarioRepository.deleteById(id);
		
	}
}
