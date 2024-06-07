package kinder.kinder.service.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kinder.kinder.entity.Seccion;
import kinder.kinder.repository.SeccionRepository;
import kinder.kinder.service.ISeccionService;

@Service
public class SeccionService implements ISeccionService{
	
	@Autowired
	private SeccionRepository seccionRepository;
	
	public List<Seccion> buscarTodos(){
		return seccionRepository.findAll();
	}

	@Override
	public void guardar(Seccion registro) {
		seccionRepository.save(registro);
		
	}

	@Override
	public void modificar(Seccion registro) {
		seccionRepository.save(registro);
		
	}

	@Override
	public Optional<Seccion> buscarId(Integer id) {
		
		return seccionRepository.findById(id);
	}

	@Override
	public void eliminar(Integer id) {
		seccionRepository.deleteById(id);
		
	}

}
