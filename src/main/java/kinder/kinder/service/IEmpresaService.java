package kinder.kinder.service;

import java.util.List;
import java.util.Optional;

import kinder.kinder.entity.Empresa;

public  interface IEmpresaService {
    List<Empresa> buscarTodos();
	Empresa guardar(Empresa empresa);
	Empresa modificar(Empresa empresa);
	Optional<Empresa> buscarId(Integer id);
	void eliminar(Integer id);
}
