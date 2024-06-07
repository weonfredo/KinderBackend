package kinder.kinder.service;

import java.util.List;
import java.util.Optional;

import kinder.kinder.entity.Movimiento;

public interface IMovimientoService {

    List<Movimiento> buscarTodos();

    void guardar(Movimiento movimiento);

    void modificar(Movimiento movimiento);

    Optional<Movimiento> buscarId(Integer id);

    void eliminar(Integer id);
}
