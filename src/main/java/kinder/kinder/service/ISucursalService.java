package kinder.kinder.service;

import java.util.List;
import java.util.Optional;

import kinder.kinder.entity.Sucursal;
import kinder.kinder.request.SucursalRequest;

public interface ISucursalService {

	List<Sucursal> buscarTodos();

	Sucursal guardar(SucursalRequest sucursal);

	Sucursal modificar(SucursalRequest sucursal);

	Optional<Sucursal> buscarId(Integer id);

	void eliminar(Integer id);
}
