package kinder.kinder.service;

import java.util.List;
import java.util.Optional;

import kinder.kinder.entity.TipoPago;

public interface ITipoPagoService {
    List<TipoPago> buscarTodos();

    void guardar(TipoPago tipoPago);

    void modificar(TipoPago tipoPago);

    Optional<TipoPago> buscarId(Integer id);

    void eliminar(Integer id);
}
