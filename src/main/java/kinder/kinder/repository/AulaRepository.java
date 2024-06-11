package kinder.kinder.repository;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import kinder.kinder.entity.Aula;

public interface AulaRepository extends JpaRepository<Aula, Integer>{

	Optional<Aula> findByNombre(String aula);

}
