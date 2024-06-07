package kinder.kinder.service;

import java.util.List;

import kinder.kinder.entity.Periodo;

public interface IPeriodoService {
    List<Periodo> findAll();
    Periodo findById(Long id);
    Periodo save(Periodo periodo);
    void deleteById(Long id);
}
