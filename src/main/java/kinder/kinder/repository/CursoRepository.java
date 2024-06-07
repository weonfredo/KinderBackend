package kinder.kinder.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import kinder.kinder.entity.Curso;

public interface CursoRepository extends JpaRepository<Curso, Integer>{
	Optional<Curso> findByCurso(String curso);

	boolean existsByCurso(String string);
}
