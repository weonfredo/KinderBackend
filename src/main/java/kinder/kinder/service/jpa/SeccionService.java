package kinder.kinder.service.jpa;

import kinder.kinder.entity.Seccion;
import kinder.kinder.repository.SeccionRepository;
import kinder.kinder.service.ISeccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SeccionService implements ISeccionService {

    @Autowired
    private SeccionRepository seccionRepo;

    @Override
    public List<Seccion> buscarTodos() {
        return seccionRepo.findAll();
    }

    @Override
    public void guardar(Seccion seccion) {
        seccionRepo.save(seccion);
    }

    @Override
    public void modificar(Integer id, Seccion seccion) {
        seccion.setId(id); // Asegura que el ID se establezca correctamente para la modificación
        seccionRepo.save(seccion);
    }

    @Override
    public Optional<Seccion> buscarId(Integer id) {
        return seccionRepo.findById(id);
    }

    @Override
    public void eliminar(Integer id) {
        seccionRepo.deleteById(id);
    }
}
