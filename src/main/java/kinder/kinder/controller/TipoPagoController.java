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

import kinder.kinder.entity.TipoPago;
import kinder.kinder.service.ITipoPagoService;

@RestController
@RequestMapping("/tipo-pago")
public class TipoPagoController {
    @Autowired
    private ITipoPagoService tipoPagoService;

    @GetMapping("/todos")
    public List<TipoPago> buscarTodos() {
        return tipoPagoService.buscarTodos();
    }

    @PostMapping("/registro")
    public TipoPago guardar(@RequestBody TipoPago tipoPago) {
        tipoPagoService.guardar(tipoPago);
        return tipoPago;
    }

    @PutMapping("/modificar")
    public TipoPago modificar(@RequestBody TipoPago tipoPago) {
        tipoPagoService.modificar(tipoPago);
        return tipoPago;
    }

    @GetMapping("/buscar/{id}")
    public Optional<TipoPago> buscarId(@PathVariable("id") Integer id) {
        return tipoPagoService.buscarId(id);
    }

    @DeleteMapping("/eliminar/{id}")
    public String eliminar(@PathVariable("id") Integer id) {
        tipoPagoService.eliminar(id);
        return "Tipo de pago eliminado";
    }
}
