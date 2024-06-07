package kinder.kinder.service.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kinder.kinder.entity.GradoSecciones;
import kinder.kinder.repository.GradoSeccionesRepository;
import kinder.kinder.service.IGradoSeccionesService;

@Service
public class GradoSeccionesServices implements IGradoSeccionesService {
	
	@Autowired
	private GradoSeccionesRepository gradoseccionesRepository;
	
	public List<GradoSecciones> buscarTodos(){
		return gradoseccionesRepository.findAll();
	}

	@Override
	public void guardar(GradoSecciones registro) {
		gradoseccionesRepository.save(registro);
		
	}

	@Override
	public void modificar(GradoSecciones registro) {
		gradoseccionesRepository.save(registro);
		
	}

	@Override
	public Optional<GradoSecciones> buscarId(Integer id) {
		
		return gradoseccionesRepository.findById(id);
	}

	@Override
	public void eliminar(Integer id) {
		gradoseccionesRepository.deleteById(id);
		
	}



}
