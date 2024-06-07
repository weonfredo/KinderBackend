package kinder.kinder.service;

import java.util.List;
import java.util.Optional;

import kinder.kinder.entity.Pagos;

public interface IPagosService {
    List<Pagos> buscarTodos();

    void guardar(Pagos pagos);

    void modificar(Pagos pagos);

    Optional<Pagos> buscarId(Integer id);

    void eliminar(Integer id);
}
