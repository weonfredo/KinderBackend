package kinder.kinder.service.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kinder.kinder.entity.Turno;
import kinder.kinder.repository.TurnoRepository;
import kinder.kinder.service.ITurnoService;

@Service
public class TurnoService implements ITurnoService {
	
	@Autowired
	private TurnoRepository turnoRepository;
	
	public List<Turno> buscarTodos(){
		return turnoRepository.findAll();
	}

	@Override
	public void guardar(Turno registro) {
		turnoRepository.save(registro);
		
	}

	@Override
	public void modificar(Turno registro) {
		turnoRepository.save(registro);
		
	}

	@Override
	public Optional<Turno> buscarId(Integer id) {
		
		return turnoRepository.findById(id);
	}

	@Override
	public void eliminar(Integer id) {
		turnoRepository.deleteById(id);
		
	}

}
