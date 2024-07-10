package kinder.kinder.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import kinder.kinder.entity.Docente;

public interface DocenteRepository extends JpaRepository<Docente, Integer> {

    Optional<Docente> findByDni(String dni);
}
