package kinder.kinder.service;

import java.util.List;
import java.util.Optional;

import kinder.kinder.entity.TurnoCaja;

public interface ITurnoCajaService {
    List<TurnoCaja> buscarTodos();

    void guardar(TurnoCaja turnoCaja);

    void modificar(TurnoCaja turnoCaja);

    Optional<TurnoCaja> buscarId(Integer id);

    void eliminar(Integer id);
}
