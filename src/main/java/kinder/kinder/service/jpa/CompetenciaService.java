package kinder.kinder.service.jpa;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import kinder.kinder.repository.CompetenciaRepository;
import kinder.kinder.entity.Competencia;
import kinder.kinder.service.ICompetenciaService; 
@Service
public class CompetenciaService implements ICompetenciaService {
	@Autowired
	private CompetenciaRepository repoCompetencia;
	public List<Competencia> buscarTodos(){
		return repoCompetencia.findAll();
		
	}
	
	public void guardar(Competencia competencia) {
		repoCompetencia.save(competencia);
	}
	
	public void modificar(Competencia competencia) {
		repoCompetencia.save(competencia);
	}
	
	public Optional<Competencia> buscarId(Integer id){
		return repoCompetencia.findById(id);
	}
	
	public void eliminar(Integer id) {
		repoCompetencia.deleteById(id);
	}
}
