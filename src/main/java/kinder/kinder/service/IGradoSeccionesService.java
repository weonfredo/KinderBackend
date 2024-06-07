package kinder.kinder.service;

import java.util.List;
import java.util.Optional;

import kinder.kinder.entity.GradoSecciones;

public interface IGradoSeccionesService {
	
	
	List<GradoSecciones> buscarTodos();
	void guardar(GradoSecciones gradoSecciones);
	void modificar(GradoSecciones gradoSecciones);
	Optional<GradoSecciones> buscarId(Integer id);
	void eliminar(Integer id);


}
