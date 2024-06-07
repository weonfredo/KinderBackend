package kinder.kinder.service.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kinder.kinder.entity.Aula;
import kinder.kinder.repository.AulaRepository;
import kinder.kinder.service.IAulaService;

@Service
public class AulaService implements IAulaService {
	
	@Autowired
	private AulaRepository aulaRepository;
	
	public List<Aula> buscarTodos(){
		return aulaRepository.findAll();
	}

	@Override
	public void guardar(Aula registro) {
		aulaRepository.save(registro);
		
	}

	@Override
	public void modificar(Aula registro) {
		aulaRepository.save(registro);
		
	}

	@Override
	public Optional<Aula> buscarId(Integer id) {
		
		return aulaRepository.findById(id);
	}

	@Override
	public void eliminar(Integer id) {
		aulaRepository.deleteById(id);
		
	}



}
