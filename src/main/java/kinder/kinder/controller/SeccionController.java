package kinder.kinder.controller;

import kinder.kinder.entity.Seccion;
import kinder.kinder.service.ISeccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/seccion")
public class SeccionController {

    @Autowired
    private ISeccionService seccionService;

    @GetMapping("/todos")
    public List<Seccion> buscarTodos() {
        return seccionService.buscarTodos();
    }

    @PostMapping("/registro")
    public Seccion guardar(@RequestBody Seccion seccion) {
        seccionService.guardar(seccion);
        // Devuelve el objeto guardado si es necesario
        return seccion;
    }

    @PutMapping("/modificar/{id}")
    public Seccion modificar(@PathVariable("id") Integer id, @RequestBody Seccion seccion) {
        seccionService.modificar(id, seccion);
        // Devuelve el objeto modificado si es necesario
        return seccion;
    }

    @GetMapping("/buscar/{id}")
    public Optional<Seccion> buscarId(@PathVariable("id") Integer id) {
        return seccionService.buscarId(id);
    }

    @DeleteMapping("/eliminar/{id}")
    public String eliminar(@PathVariable("id") Integer id) {
        seccionService.eliminar(id);
        return "Sección eliminada";
    }
}
