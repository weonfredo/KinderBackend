package kinder.kinder.service;

import java.util.List;
import java.util.Optional;

import kinder.kinder.entity.Docente;
import kinder.kinder.request.DocenteRequest;

public interface IDocenteService {
    List<Docente> buscarTodos();

    Docente guardar(DocenteRequest registro);

    Docente modificar(DocenteRequest registro);

    Optional<Docente> buscarId(Integer id);

    void eliminar(Integer id);
}
