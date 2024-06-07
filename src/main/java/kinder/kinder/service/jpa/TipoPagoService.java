package kinder.kinder.service.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kinder.kinder.entity.TipoPago;
import kinder.kinder.repository.TipoPagoRepository;
import kinder.kinder.service.ITipoPagoService;

@Service
public class TipoPagoService implements ITipoPagoService {
    @Autowired
    private TipoPagoRepository tipoPagoRepository;

    public List<TipoPago> buscarTodos() {
        return tipoPagoRepository.findAll();
    }

    @Override
    public void guardar(TipoPago registro) {
        tipoPagoRepository.save(registro);

    }

    @Override
    public void modificar(TipoPago registro) {
        tipoPagoRepository.save(registro);

    }

    @Override
    public Optional<TipoPago> buscarId(Integer id) {

        return tipoPagoRepository.findById(id);
    }

    @Override
    public void eliminar(Integer id) {
        tipoPagoRepository.deleteById(id);

    }
}
