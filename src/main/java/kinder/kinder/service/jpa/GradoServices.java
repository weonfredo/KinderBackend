package kinder.kinder.service.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kinder.kinder.entity.Grado;
import kinder.kinder.entity.Turno;
import kinder.kinder.repository.GradoRepository;
import kinder.kinder.repository.TurnoRepository;
import kinder.kinder.request.GradoRequest;
import kinder.kinder.service.IGradoService;

@Service
public class GradoServices implements IGradoService{
	
	@Autowired
	private GradoRepository gradoRepository;

	@Autowired
	private TurnoRepository turnoRepository;
	
	public List<Grado> buscarTodos(){
		return gradoRepository.findAll();
	}

	@Override
	public void guardar(GradoRequest registro) {
		Turno turno = turnoRepository.findById(registro.getId_turno())
                .orElseThrow(() -> new RuntimeException("Sección no encontrada con ID: " + registro.getId_turno()));
		Grado grado = new Grado();
		grado.setNombre(registro.getNombre());
        grado.setTurno(turno);
		gradoRepository.save(grado);
	}

	@Override
	public void modificar(GradoRequest registro) {
		Grado grado = gradoRepository.findByNombre(registro.getNombre())
                .orElseThrow(() -> new IllegalArgumentException("Grado no encontrada: " + registro.getNombre()));
		grado.setNombre(registro.getNombre());
		Turno turno = turnoRepository.findById(registro.getId_turno())
                .orElseThrow(() -> new IllegalArgumentException("Turno no encontrada: " + registro.getId_turno()));
		grado.setTurno(turno);
		gradoRepository.save(grado);
		
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
