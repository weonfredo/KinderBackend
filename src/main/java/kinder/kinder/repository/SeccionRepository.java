package kinder.kinder.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import kinder.kinder.entity.Seccion;

public interface SeccionRepository extends JpaRepository<Seccion, Integer>{

	Optional<Seccion> findByNombre(String seccion);

}
