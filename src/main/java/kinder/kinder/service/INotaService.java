package kinder.kinder.service;

import java.util.List;

import kinder.kinder.entity.Nota;

public interface INotaService {
    List<Nota> findAll();
    Nota findById(Long id);
    Nota save(Nota nota);
    void deleteById(Long id);
}
