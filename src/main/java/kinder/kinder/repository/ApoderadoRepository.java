package kinder.kinder.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import kinder.kinder.entity.Apoderado;

public interface ApoderadoRepository extends JpaRepository<Apoderado, Integer> {

	Optional<Apoderado> findByDni(String dniApoderado);

}
