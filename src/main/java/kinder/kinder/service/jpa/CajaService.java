package kinder.kinder.service.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kinder.kinder.entity.Caja;
import kinder.kinder.repository.CajaRepository;
import kinder.kinder.service.ICajaService;

@Service
public class CajaService implements ICajaService {
    @Autowired
    private CajaRepository cajaRepository;

    public List<Caja> buscarTodos() {
        return cajaRepository.findAll();
    }

    @Override
    public void guardar(Caja registro) {
        cajaRepository.save(registro);

    }

    @Override
    public void modificar(Caja registro) {
        cajaRepository.save(registro);

    }

    @Override
    public Optional<Caja> buscarId(Integer id) {

        return cajaRepository.findById(id);
    }

    @Override
    public void eliminar(Integer id) {
        cajaRepository.deleteById(id);

    }
}
