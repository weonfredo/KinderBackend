package kinder.kinder.service.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kinder.kinder.entity.MetodoPago;
import kinder.kinder.repository.MetodoPagoRepository;
import kinder.kinder.service.IMetodoPagoService;

@Service
public class MetodoPagoService implements IMetodoPagoService {
    @Autowired
    private MetodoPagoRepository metodoPagoRepository;

    public List<MetodoPago> buscarTodos() {
        return metodoPagoRepository.findAll();
    }

    @Override
    public void guardar(MetodoPago registro) {
        metodoPagoRepository.save(registro);

    }

    @Override
    public void modificar(MetodoPago registro) {
        metodoPagoRepository.save(registro);

    }

    @Override
    public Optional<MetodoPago> buscarId(Integer id) {

        return metodoPagoRepository.findById(id);
    }

    @Override
    public void eliminar(Integer id) {
        metodoPagoRepository.deleteById(id);

    }
}
