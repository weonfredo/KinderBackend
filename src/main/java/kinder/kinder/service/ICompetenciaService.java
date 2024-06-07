
package kinder.kinder.service;
import java.util.List;
import java.util.Optional;
import kinder.kinder.entity.Competencia;
public interface ICompetenciaService {
	List<Competencia> buscarTodos();
	
	void guardar(Competencia competencia);
	void modificar(Competencia competencia);
	Optional<Competencia> buscarId(Integer id);
	void eliminar(Integer id);
}