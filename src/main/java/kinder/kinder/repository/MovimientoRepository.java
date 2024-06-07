package kinder.kinder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import kinder.kinder.entity.Movimiento;

public interface MovimientoRepository extends JpaRepository<Movimiento, Integer> {

}