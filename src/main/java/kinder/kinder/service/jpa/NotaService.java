package kinder.kinder.service.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kinder.kinder.entity.Nota;
import kinder.kinder.repository.NotaRepository;
import kinder.kinder.service.INotaService;

import java.util.List;

@Service
public class NotaService implements INotaService {

    @Autowired
    private NotaRepository notaRepository;

    @Override
    public List<Nota> findAll() {
        return notaRepository.findAll();
    }

    @Override
    public Nota findById(Long id) {
        return notaRepository.findById(id).orElse(null);
    }

    @Override
    public Nota save(Nota nota) {
        return notaRepository.save(nota);
    }

    @Override
    public void deleteById(Long id) {
        notaRepository.deleteById(id);
    }
}
