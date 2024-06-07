package kinder.kinder.service.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kinder.kinder.entity.Modulo;
import kinder.kinder.repository.ModuloRepository;
import kinder.kinder.service.IModuloService;

@Service
public class ModuloService implements IModuloService{
	
	@Autowired
	private ModuloRepository moduloRepository;
	
	public List<Modulo> buscarTodos(){
		return moduloRepository.findAll();
	}

	@Override
	public void guardar(Modulo modulo) {
		moduloRepository.save(modulo);
		
	}

	@Override
	public void modificar(Modulo modulo){
		moduloRepository.save(modulo);
		
	}

	@Override
	public Optional<Modulo> buscarId(Integer id) {
		
		return moduloRepository.findById(id);
	}

	@Override
	public void eliminar(Integer id) {
		moduloRepository.deleteById(id);
		
	}
	
}
