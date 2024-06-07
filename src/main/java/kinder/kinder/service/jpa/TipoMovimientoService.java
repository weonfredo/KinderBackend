package kinder.kinder.service.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kinder.kinder.entity.TipoMovimiento;
import kinder.kinder.repository.TipoMovimientoRepository;
import kinder.kinder.service.ITipoMovimientoService;

@Service
public class TipoMovimientoService implements ITipoMovimientoService {
    @Autowired
    private TipoMovimientoRepository tipoMovimientoRepository;

    public List<TipoMovimiento> buscarTodos() {
        return tipoMovimientoRepository.findAll();
    }

    @Override
    public void guardar(TipoMovimiento registro) {
        tipoMovimientoRepository.save(registro);

    }

    @Override
    public void modificar(TipoMovimiento registro) {
        tipoMovimientoRepository.save(registro);

    }

    @Override
    public Optional<TipoMovimiento> buscarId(Integer id) {

        return tipoMovimientoRepository.findById(id);
    }

    @Override
    public void eliminar(Integer id) {
        tipoMovimientoRepository.deleteById(id);

    }
}
