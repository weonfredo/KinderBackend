package kinder.kinder.service;

import java.util.List;
import java.util.Optional;

import kinder.kinder.entity.TipoMovimiento;

public interface ITipoMovimientoService {
    List<TipoMovimiento> buscarTodos();

    void guardar(TipoMovimiento tipoMovimiento);

    void modificar(TipoMovimiento tipoMovimiento);

    Optional<TipoMovimiento> buscarId(Integer id);

    void eliminar(Integer id);
}
