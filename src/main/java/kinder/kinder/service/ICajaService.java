package kinder.kinder.service;

import java.util.List;
import java.util.Optional;

import kinder.kinder.entity.Caja;

public interface ICajaService {

    List<Caja> buscarTodos();

    void guardar(Caja caja);

    void modificar(Caja caja);

    Optional<Caja> buscarId(Integer id);

    void eliminar(Integer id);

}
