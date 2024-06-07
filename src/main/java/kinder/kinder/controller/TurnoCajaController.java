package kinder.kinder.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kinder.kinder.entity.TurnoCaja;
import kinder.kinder.service.ITurnoCajaService;

@RestController
@RequestMapping("/turno-caja")
public class TurnoCajaController {
    @Autowired
    private ITurnoCajaService turnoCajaService;

    @GetMapping("/todos")
    public List<TurnoCaja> buscarTodos() {
        return turnoCajaService.buscarTodos();
    }

    @PostMapping("/registro")
    public TurnoCaja guardar(@RequestBody TurnoCaja turnoCaja) {
        turnoCajaService.guardar(turnoCaja);
        return turnoCaja;
    }

    @PutMapping("/modificar")
    public TurnoCaja modificar(@RequestBody TurnoCaja turnoCaja) {
        turnoCajaService.modificar(turnoCaja);
        return turnoCaja;
    }

    @GetMapping("/buscar/{id}")
    public Optional<TurnoCaja> buscarId(@PathVariable("id") Integer id) {
        return turnoCajaService.buscarId(id);
    }

    @DeleteMapping("/eliminar/{id}")
    public String eliminar(@PathVariable("id") Integer id) {
        turnoCajaService.eliminar(id);
        return "Turno de caja eliminado";
    }
}
