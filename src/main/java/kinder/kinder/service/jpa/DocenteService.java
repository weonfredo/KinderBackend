package kinder.kinder.service.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kinder.kinder.entity.Docente;
import kinder.kinder.repository.DocenteRepository;
import kinder.kinder.service.IDocenteService;

import java.util.List;

@Service
public class DocenteService implements IDocenteService {

    @Autowired
    private DocenteRepository docenteRepository;

    @Override
    public List<Docente> findAll() {
        return docenteRepository.findAll();
    }

    @Override
    public Docente findById(String dni) {
        return docenteRepository.findById(dni).orElse(null);
    }

    @Override
    public Docente save(Docente docente) {
        return docenteRepository.save(docente);
    }

    @Override
    public void deleteById(String dni) {
        docenteRepository.deleteById(dni);
    }
}
