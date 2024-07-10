package kinder.kinder.service;

import kinder.kinder.entity.Aula;
import kinder.kinder.request.AulaRequest;

import java.util.List;
import java.util.Optional;

public interface IAulaService {
    List<Aula> buscarTodos();
    Aula guardar(AulaRequest registro);
    Aula modificar(AulaRequest registro);
    Optional<Aula> buscarId(Integer id);
    void eliminar(Integer id);
}
