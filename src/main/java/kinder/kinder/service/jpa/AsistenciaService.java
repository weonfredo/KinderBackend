package kinder.kinder.service.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kinder.kinder.entity.Asistencia;
import kinder.kinder.repository.AsistenciaRepository;
import kinder.kinder.service.IAsistenciaService;

import java.util.List;

@Service
public class AsistenciaService implements IAsistenciaService {

    @Autowired
    private AsistenciaRepository asistenciaRepository;

    @Override
    public List<Asistencia> findAll() {
        return asistenciaRepository.findAll();
    }

    @Override
    public Asistencia findById(Long id) {
        return asistenciaRepository.findById(id).orElse(null);
    }

    @Override
    public Asistencia save(Asistencia asistencia) {
        return asistenciaRepository.save(asistencia);
    }

    @Override
    public void deleteById(Long id) {
        asistenciaRepository.deleteById(id);
    }
}
