package kinder.kinder.service;

import java.util.List;

import kinder.kinder.entity.Docente;

public interface IDocenteService {
    List<Docente> findAll();
    Docente findById(String dni);
    Docente save(Docente docente);
    void deleteById(String dni);
}
