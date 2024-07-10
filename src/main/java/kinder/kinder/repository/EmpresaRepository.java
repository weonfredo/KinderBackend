package kinder.kinder.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import kinder.kinder.entity.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Integer>{

	Optional<Empresa> findByNombre(String nombre);

}

