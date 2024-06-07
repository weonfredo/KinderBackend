package kinder.kinder.service.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import kinder.kinder.entity.Acceso;
import kinder.kinder.repository.AccesoRepository;
import kinder.kinder.service.IAccesoService;



public class AccesoService implements IAccesoService{
	@Autowired
	private AccesoRepository accesoRepository;
	
	public List<Acceso> buscarTodos(){
		return accesoRepository.findAll();
	}

	@Override
	public void guardar(Acceso acceso) {
		accesoRepository.save(acceso);
		
	}

	@Override
	public void modificar(Acceso acceso){
		accesoRepository.save(acceso);
		
	}

	@Override
	public Optional<Acceso> buscarId(Integer id) {
		
		return accesoRepository.findById(id);
	}

	@Override
	public void eliminar(Integer id) {
		accesoRepository.deleteById(id);
		
	}
}
