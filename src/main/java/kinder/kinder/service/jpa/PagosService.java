package kinder.kinder.service.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kinder.kinder.entity.Pagos;
import kinder.kinder.repository.PagosRepository;
import kinder.kinder.service.IPagosService;

@Service
public class PagosService implements IPagosService {
    @Autowired
    private PagosRepository pagosRepository;

    public List<Pagos> buscarTodos() {
        return pagosRepository.findAll();
    }

    @Override
    public void guardar(Pagos registro) {
        pagosRepository.save(registro);

    }

    @Override
    public void modificar(Pagos registro) {
        pagosRepository.save(registro);

    }

    @Override
    public Optional<Pagos> buscarId(Integer id) {

        return pagosRepository.findById(id);
    }

    @Override
    public void eliminar(Integer id) {
        pagosRepository.deleteById(id);

    }
}
