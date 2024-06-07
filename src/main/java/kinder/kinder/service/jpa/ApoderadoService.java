package kinder.kinder.service.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import kinder.kinder.entity.Apoderado;
import kinder.kinder.repository.ApoderadoRepository;
import kinder.kinder.service.IApoderadoService;

@Service
public class ApoderadoService implements IApoderadoService {
	@Autowired
	private ApoderadoRepository apoderadoRepository;
	
	public List<Apoderado> buscarTodos(){
		return apoderadoRepository.findAll();
	}

	@Override
	public void guardar(Apoderado registro) {
		apoderadoRepository.save(registro);
		
	}

	@Override
	public void modificar(Apoderado registro) {
		apoderadoRepository.save(registro);
		
	}

	@Override
	public Optional<Apoderado> buscarId(Integer id) {
		
		return apoderadoRepository.findById(id);
	}

	@Override
	public void eliminar(Integer id) {
		apoderadoRepository.deleteById(id);
		
	}


}
