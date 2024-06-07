package kinder.kinder.service.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kinder.kinder.entity.Movimiento;
import kinder.kinder.repository.MovimientoRepository;
import kinder.kinder.service.IMovimientoService;

@Service
public class MovimientoService implements IMovimientoService {
    @Autowired
    private MovimientoRepository movimientoRepository;

    public List<Movimiento> buscarTodos() {
        return movimientoRepository.findAll();
    }

    @Override
    public void guardar(Movimiento registro) {
        movimientoRepository.save(registro);

    }

    @Override
    public void modificar(Movimiento registro) {
        movimientoRepository.save(registro);

    }

    @Override
    public Optional<Movimiento> buscarId(Integer id) {

        return movimientoRepository.findById(id);
    }

    @Override
    public void eliminar(Integer id) {
        movimientoRepository.deleteById(id);

    }
}
