package kinder.kinder.service;

import java.util.List;
import java.util.Optional;

import kinder.kinder.entity.Turno;
import kinder.kinder.request.TurnoRequest;

public interface ITurnoService {
    List<Turno> buscarTodos();
    void guardar(TurnoRequest turnoRequest);
    void modificar(Integer id, TurnoRequest turnoRequest);
    Optional<Turno> buscarId(Integer id);
    void eliminar(Integer id);
}
