package kinder.kinder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import kinder.kinder.entity.Nota;

public interface NotaRepository extends JpaRepository<Nota, Long> {
}

