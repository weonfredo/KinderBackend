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

import kinder.kinder.entity.TipoMovimiento;
import kinder.kinder.service.ITipoMovimientoService;

@RestController
@RequestMapping("/tipo-movimiento")
public class TipoMovimientoController {
    @Autowired
    private ITipoMovimientoService servicioTipoMovimiento;

    @GetMapping("/todos")
    public List<TipoMovimiento> buscarTodos() {
        return servicioTipoMovimiento.buscarTodos();
    }

    @PostMapping("/registro")
    public TipoMovimiento guardar(@RequestBody TipoMovimiento tipoMovimiento) {
        servicioTipoMovimiento.guardar(tipoMovimiento);
        return tipoMovimiento;
    }

    @PutMapping("/modificar")
    public TipoMovimiento modificar(@RequestBody TipoMovimiento tipoMovimiento) {
        servicioTipoMovimiento.modificar(tipoMovimiento);
        return tipoMovimiento;
    }

    @GetMapping("/buscar/{id}")
    public Optional<TipoMovimiento> buscarId(@PathVariable("id") Integer id) {
        return servicioTipoMovimiento.buscarId(id);
    }

    @DeleteMapping("/eliminar/{id}")
    public String eliminar(@PathVariable("id") Integer id) {
        servicioTipoMovimiento.eliminar(id);
        return "Tipo de movimiento eliminado";
    }
}
