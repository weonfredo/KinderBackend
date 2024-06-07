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

import kinder.kinder.entity.Pagos;
import kinder.kinder.service.IPagosService;

@RestController
@RequestMapping("/pagos")
public class PagosController {
    @Autowired
    private IPagosService servicioPagos;

    @GetMapping("/todos")
    public List<Pagos> buscarTodos() {
        return servicioPagos.buscarTodos();
    }

    @PostMapping("/registro")
    public Pagos guardar(@RequestBody Pagos pagos) {
        servicioPagos.guardar(pagos);
        return pagos;
    }

    @PutMapping("/modificar")
    public Pagos modificar(@RequestBody Pagos pagos) {
        servicioPagos.modificar(pagos);
        return pagos;
    }

    @GetMapping("/buscar/{id}")
    public Optional<Pagos> buscarId(@PathVariable("id") Integer id) {
        return servicioPagos.buscarId(id);
    }

    @DeleteMapping("/eliminar/{id}")
    public String eliminar(@PathVariable("id") Integer id) {
        servicioPagos.eliminar(id);
        return "Pago eliminado";
    }
}
