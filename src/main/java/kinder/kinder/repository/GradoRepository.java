package kinder.kinder.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import kinder.kinder.entity.Grado;

public interface GradoRepository extends JpaRepository<Grado, Integer>{

	Optional<Grado> findByNombre(String grado);

}
