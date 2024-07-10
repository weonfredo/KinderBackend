package kinder.kinder.service.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kinder.kinder.entity.Perfil;
import kinder.kinder.repository.PerfilRepository;
import kinder.kinder.service.IPerfilService;

@Service
public class PerfilService implements IPerfilService{
	@Autowired
	private PerfilRepository perfilRepository;
	
	public List<Perfil> buscarTodos(){
		return perfilRepository.findAll();
	}

	@Override
	public Perfil guardar(Perfil perfil) {
		perfilRepository.save(perfil);
		return perfil;
	}

	@Override
	public Perfil modificar(Perfil perfil){
		perfilRepository.save(perfil);
		return perfil;
		
	}

	@Override
	public Optional<Perfil> buscarId(Integer id) {
		
		return perfilRepository.findById(id);
	}

	@Override
	public void eliminar(Integer id) {
		perfilRepository.deleteById(id);
		
	}
}
