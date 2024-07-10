package kinder.kinder.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import kinder.kinder.entity.Turno;
import kinder.kinder.request.TurnoRequest;
import kinder.kinder.service.ITurnoService;

@RestController
@RequestMapping("/turno")
public class TurnoController {

    @Autowired
    private ITurnoService turnoService;

    @GetMapping("/todos")
    public List<Turno> buscarTodos() {
        return turnoService.buscarTodos();
    }

    @PostMapping("/registro")
    public Turno guardar(@RequestBody TurnoRequest turnoRequest) {
        turnoService.guardar(turnoRequest);
        // Podrías devolver el objeto creado si necesitas algún dato extra
        // o simplemente un mensaje de confirmación.
        return new Turno();
    }

    @PutMapping("/modificar/{id}")
    public Turno modificar(@PathVariable("id") Integer id, @RequestBody TurnoRequest turnoRequest) {
        turnoService.modificar(id, turnoRequest);
        // Devolver el objeto modificado si es necesario
        return new Turno();
    }

    @GetMapping("/buscar/{id}")
    public Optional<Turno> buscarId(@PathVariable("id") Integer id) {
        return turnoService.buscarId(id);
    }

    @DeleteMapping("/eliminar/{id}")
    public String eliminar(@PathVariable("id") Integer id) {
        turnoService.eliminar(id);
        return "Turno eliminado";
    }
}
