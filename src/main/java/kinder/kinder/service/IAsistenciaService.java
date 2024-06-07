package kinder.kinder.service;

import java.util.List;

import kinder.kinder.entity.Asistencia;

public interface IAsistenciaService {
	List<Asistencia> findAll();
    Asistencia findById(Long id);
    Asistencia save(Asistencia asistencia);
    void deleteById(Long id);
}
