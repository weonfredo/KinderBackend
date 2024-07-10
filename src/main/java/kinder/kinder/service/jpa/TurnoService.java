package kinder.kinder.service.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kinder.kinder.entity.Turno;
import kinder.kinder.repository.TurnoRepository;
import kinder.kinder.service.ITurnoService;
import kinder.kinder.request.TurnoRequest;

@Service
public class TurnoService implements ITurnoService {
    
    @Autowired
    private TurnoRepository turnoRepo;
    
    @Override
    public List<Turno> buscarTodos() {
        return turnoRepo.findAll();
    }

    @Override
    public void guardar(TurnoRequest turnoRequest) {
        Turno nuevoTurno = new Turno();
        nuevoTurno.setNombre(turnoRequest.getNombre());
        nuevoTurno.setHorainicio(turnoRequest.getHorainicio());
        nuevoTurno.setHorafinal(turnoRequest.getHorafinal());
        turnoRepo.save(nuevoTurno);
    }

    @Override
    public void modificar(Integer id, TurnoRequest turnoRequest) {
        Turno turno = turnoRepo.findById(id).orElseThrow(() -> new RuntimeException("Turno no encontrado"));
        turno.setNombre(turnoRequest.getNombre());
        turno.setHorainicio(turnoRequest.getHorainicio());
        turno.setHorafinal(turnoRequest.getHorafinal());
        turnoRepo.save(turno);
    }

    @Override
    public Optional<Turno> buscarId(Integer id) {
        return turnoRepo.findById(id);
    }

    @Override
    public void eliminar(Integer id) {
        turnoRepo.deleteById(id);
    }
}
