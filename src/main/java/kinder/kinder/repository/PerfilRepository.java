package kinder.kinder.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import kinder.kinder.entity.Perfil;
import kinder.kinder.entity.Usuario;

public interface PerfilRepository extends JpaRepository<Perfil, Integer> {

	Optional<Perfil> findByPerfil(String perfil);

	boolean existsByPerfil(String string);

}
