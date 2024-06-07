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

import kinder.kinder.entity.Movimiento;
import kinder.kinder.service.IMovimientoService;

@RestController
@RequestMapping("/movimiento")
public class MovimientoController {
    @Autowired
    private IMovimientoService servicioMovimiento;

    @GetMapping("/todos")
    public List<Movimiento> buscarTodos() {
        return servicioMovimiento.buscarTodos();
    }

    @PostMapping("/registro")
    public Movimiento guardar(@RequestBody Movimiento movimiento) {
        servicioMovimiento.guardar(movimiento);
        return movimiento;
    }

    @PutMapping("/modificar")
    public Movimiento modificar(@RequestBody Movimiento movimiento) {
        servicioMovimiento.modificar(movimiento);
        return movimiento;
    }

    @GetMapping("/buscar/{id}")
    public Optional<Movimiento> buscarId(@PathVariable("id") Integer id) {
        return servicioMovimiento.buscarId(id);
    }

    @DeleteMapping("/eliminar/{id}")
    public String eliminar(@PathVariable("id") Integer id) {
        servicioMovimiento.eliminar(id);
        return "Movimiento eliminado";
    }
}
