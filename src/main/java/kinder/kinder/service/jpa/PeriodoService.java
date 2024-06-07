package kinder.kinder.service.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kinder.kinder.entity.Periodo;
import kinder.kinder.repository.PeriodoRepository;
import kinder.kinder.service.IPeriodoService;

import java.util.List;

@Service
public class PeriodoService implements IPeriodoService {

    @Autowired
    private PeriodoRepository periodoRepository;

    @Override
    public List<Periodo> findAll() {
        return periodoRepository.findAll();
    }

    @Override
    public Periodo findById(Long id) {
        return periodoRepository.findById(id).orElse(null);
    }

    @Override
    public Periodo save(Periodo periodo) {
        return periodoRepository.save(periodo);
    }

    @Override
    public void deleteById(Long id) {
        periodoRepository.deleteById(id);
    }
}
