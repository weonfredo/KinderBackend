package kinder.kinder.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import kinder.kinder.entity.Competencia;

public interface CompetenciaRepository extends JpaRepository<Competencia, Integer>{
	Optional<Competencia> findByCompetencia(String competencia);

	boolean existsByCompetencia(String string);

}
