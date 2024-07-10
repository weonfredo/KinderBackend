package kinder.kinder.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import kinder.kinder.entity.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno, Integer> {

	Optional<Alumno> findByDni(String dni);

}
