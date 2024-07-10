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

import kinder.kinder.entity.Apoderado;
import kinder.kinder.service.IApoderadoService;

@RestController
@RequestMapping("/apoderado")
public class ApoderadoController {

    @Autowired
    private IApoderadoService servicioPerfil;

    @GetMapping("/todos")
    public List<Apoderado> buscarTodos() {
        return servicioPerfil.buscarTodos();
    }

    @PostMapping("/registro")
    public Apoderado guardar(@RequestBody Apoderado perfil) {
        servicioPerfil.guardar(perfil);
        return perfil;
    }

    @PutMapping("/modificar")
    public Apoderado modificar(@RequestBody Apoderado perfil) {
        servicioPerfil.modificar(perfil);
        return perfil;
    }

    @GetMapping("/buscar/{id}")
    public Optional<Apoderado> buscarId(@PathVariable("id") Integer id) {
        return servicioPerfil.buscarId(id);
    }

    @DeleteMapping("/eliminar/{id}")
    public String eliminar(@PathVariable("id") Integer id) {
        servicioPerfil.eliminar(id);
        return "Apoderado eliminado";
    }
}
