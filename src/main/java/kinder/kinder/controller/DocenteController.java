package kinder.kinder.controller;

import java.util.Collections;
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

import kinder.kinder.entity.Docente;
import kinder.kinder.request.DocenteRequest;
import kinder.kinder.service.IDocenteService;

@RestController
@RequestMapping("/docente")
public class DocenteController {
    @Autowired
    IDocenteService serviciodocente;

    @GetMapping("/todos")
    public List<Docente> buscarTodos() {
        return serviciodocente.buscarTodos();
    }

    @PostMapping("/registro")
    public void guardar(@RequestBody DocenteRequest docente) {
        serviciodocente.guardar(docente);

    }

    @PutMapping("/modificar")
    public void modificar(@RequestBody DocenteRequest docente) {
        serviciodocente.modificar(docente);

    }

    @GetMapping("/buscar/{id}")
    public Optional<Docente> buscarId(@PathVariable("id") Integer id) {
        return serviciodocente.buscarId(id);

    }

    @DeleteMapping("/eliminar/{id}")
    public String eliminar(@PathVariable("id") Integer id) {
        serviciodocente.eliminar(id);
        return "Docente eliminado";
    }

}
