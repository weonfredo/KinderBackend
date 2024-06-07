package kinder.kinder.service;

import java.util.List;
import java.util.Optional;


import kinder.kinder.entity.Aula;

public interface IAulaService {
	
	List<Aula> buscarTodos();
	void guardar(Aula aula);
	void modificar(Aula aula);
	Optional<Aula> buscarId(Integer id);
	void eliminar(Integer id);

}
