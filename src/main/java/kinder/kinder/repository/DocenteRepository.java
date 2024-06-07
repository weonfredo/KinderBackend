package kinder.kinder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import kinder.kinder.entity.Docente;

public interface DocenteRepository extends JpaRepository<Docente, String> {
}
