package kinder.kinder.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import kinder.kinder.entity.Sucursal;

public interface SucursalRepository extends JpaRepository<Sucursal, Integer>{

	Optional<Sucursal> findByNombre(String nombre);

}
