package kinder.kinder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import kinder.kinder.entity.Periodo;

public interface PeriodoRepository extends JpaRepository<Periodo, Long> {
}
