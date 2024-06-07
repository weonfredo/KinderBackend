package kinder.kinder.service;
import java.util.List;
import java.util.Optional;
import kinder.kinder.entity.Curso;
public interface ICursoService {
	List<Curso> buscarTodos();
	
	void guardar(Curso curso);
	void modificar(Curso curso);
	Optional<Curso> buscarId(Integer id);
	void eliminar(Integer id);
}
