package kinder.kinder.service;

import kinder.kinder.entity.Seccion;

import java.util.List;
import java.util.Optional;

public interface ISeccionService {
    List<Seccion> buscarTodos();
    void guardar(Seccion seccion);
    void modificar(Integer id, Seccion seccion);
    Optional<Seccion> buscarId(Integer id);
    void eliminar(Integer id);
}
