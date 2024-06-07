package kinder.kinder.service.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kinder.kinder.entity.Grado;
import kinder.kinder.repository.GradoRepository;
import kinder.kinder.service.IGradoService;

@Service
public class GradoServices implements IGradoService{
	
	@Autowired
	private GradoRepository gradoRepository;
	
	public List<Grado> buscarTodos(){
		return gradoRepository.findAll();
	}

	@Override
	public void guardar(Grado registro) {
		gradoRepository.save(registro);
		
	}

	@Override
	public void modificar(Grado registro) {
		gradoRepository.save(registro);
		
	}

	@Override
	public Optional<Grado> buscarId(Integer id) {
		
		return gradoRepository.findById(id);
	}

	@Override
	public void eliminar(Integer id) {
		gradoRepository.deleteById(id);
		
	}




}
