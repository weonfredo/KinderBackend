package kinder.kinder.service.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kinder.kinder.entity.TurnoCaja;
import kinder.kinder.repository.TurnoCajaRepository;
import kinder.kinder.service.ITurnoCajaService;

@Service
public class TurnoCajaService implements ITurnoCajaService {
    @Autowired
    private TurnoCajaRepository turnoCajaRepository;

    public List<TurnoCaja> buscarTodos() {
        return turnoCajaRepository.findAll();
    }

    @Override
    public void guardar(TurnoCaja registro) {
        turnoCajaRepository.save(registro);

    }

    @Override
    public void modificar(TurnoCaja registro) {
        turnoCajaRepository.save(registro);

    }

    @Override
    public Optional<TurnoCaja> buscarId(Integer id) {

        return turnoCajaRepository.findById(id);
    }

    @Override
    public void eliminar(Integer id) {
        turnoCajaRepository.deleteById(id);

    }
}
