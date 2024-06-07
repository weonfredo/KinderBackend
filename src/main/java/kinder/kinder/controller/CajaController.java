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

import kinder.kinder.entity.Caja;
import kinder.kinder.service.ICajaService;

@RestController
@RequestMapping("/caja")
public class CajaController {
    @Autowired
    private ICajaService servicioCaja;

    @GetMapping("/todos")
    public List<Caja> buscarTodos() {
        return servicioCaja.buscarTodos();
    }

    @PostMapping("/registro")
    public Caja guardar(@RequestBody Caja caja) {
        servicioCaja.guardar(caja);
        return caja;
    }

    @PutMapping("/modificar")
    public Caja modificar(@RequestBody Caja usuario) {
        servicioCaja.modificar(usuario);
        return usuario;
    }

    @GetMapping("/buscar/{id}")
    public Optional<Caja> buscarId(@PathVariable("id") Integer id) {
        return servicioCaja.buscarId(id);

    }

    @DeleteMapping("/eliminar/{id}")
    public String eliminar(@PathVariable("id") Integer id) {
        servicioCaja.eliminar(id);
        return "Usuario eliminado";
    }
}
