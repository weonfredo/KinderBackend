package kinder.kinder.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kinder.kinder.entity.Periodo;
import kinder.kinder.service.IPeriodoService;

@RestController
@RequestMapping("/periodo")
public class PeriodoController {

    @Autowired
    private IPeriodoService servicioPeriodo;

    @GetMapping("/todos")
    public List<Periodo> buscarTodos() {
        return servicioPeriodo.findAll();
    }

    @PostMapping("/registro")
    public Periodo guardar(@RequestBody Periodo periodo) {
        servicioPeriodo.save(periodo);
        return periodo;
    }

}