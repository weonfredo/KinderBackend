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

import kinder.kinder.entity.MetodoPago;
import kinder.kinder.service.IMetodoPagoService;

@RestController
@RequestMapping("/metodopago")
public class MetodoPagoController {
    @Autowired
    private IMetodoPagoService servicioMetodoPago;

    @GetMapping("/todos")
    public List<MetodoPago> buscarTodos() {
        return servicioMetodoPago.buscarTodos();
    }

    @PostMapping("/registro")
    public MetodoPago guardar(@RequestBody MetodoPago metodoPago) {
        servicioMetodoPago.guardar(metodoPago);
        return metodoPago;
    }

    @PutMapping("/modificar")
    public MetodoPago modificar(@RequestBody MetodoPago metodoPago) {
        servicioMetodoPago.modificar(metodoPago);
        return metodoPago;
    }

    @GetMapping("/buscar/{id}")
    public Optional<MetodoPago> buscarId(@PathVariable("id") Integer id) {
        return servicioMetodoPago.buscarId(id);
    }

    @DeleteMapping("/eliminar/{id}")
    public String eliminar(@PathVariable("id") Integer id) {
        servicioMetodoPago.eliminar(id);
        return "Metodo de pago eliminado";
    }
}
