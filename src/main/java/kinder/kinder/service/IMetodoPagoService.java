package kinder.kinder.service;

import java.util.List;
import java.util.Optional;

import kinder.kinder.entity.MetodoPago;

public interface IMetodoPagoService {

    List<MetodoPago> buscarTodos();

    void guardar(MetodoPago metodoPago);

    void modificar(MetodoPago metodoPago);

    Optional<MetodoPago> buscarId(Integer id);

    void eliminar(Integer id);
}
