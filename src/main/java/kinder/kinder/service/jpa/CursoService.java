package kinder.kinder.service.jpa;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kinder.kinder.repository.CursoRepository;
import kinder.kinder.entity.Curso;
import kinder.kinder.service.ICursoService;

@Service
public class CursoService implements ICursoService{
	@Autowired
	private CursoRepository repoCurso;
	public List<Curso> buscarTodos(){
		return repoCurso.findAll();
	}
	
	public void guardar(Curso curso) {
		repoCurso.save(curso);
	}
	
	public void modificar(Curso curso) {
		repoCurso.save(curso);
	}
	
	public Optional<Curso> buscarId(Integer id){
		return repoCurso.findById(id);
	}
	
	public void eliminar(Integer id) {
		repoCurso.deleteById(id);
	}
}
