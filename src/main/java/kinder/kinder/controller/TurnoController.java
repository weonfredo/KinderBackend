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

import kinder.kinder.entity.Turno;
import kinder.kinder.service.ITurnoService;

@RestController
@RequestMapping("/turno")
public class TurnoController {
	@Autowired
	ITurnoService servicioTurno;

	@GetMapping("/todos")
	public List<Turno> buscarTodos(){
		return servicioTurno.buscarTodos();
	}
	
	@PostMapping("/registro")
	 public Turno guardar(@RequestBody Turno turno) {
		servicioTurno.guardar(turno);
		 return turno;
	 }
	 @PutMapping("/modificar")
	 public Turno modificar(@RequestBody Turno turno) {
		 servicioTurno.modificar(turno);
		 return turno;
	 }
	 @GetMapping("/buscar/{id}")
	 public Optional<Turno> buscarId(@PathVariable("id") Integer id){
		 return servicioTurno.buscarId(id);
		 
	 }
	 @DeleteMapping("/eliminar/{id}")
	 public String eliminar(@PathVariable("id") Integer id) {
		 servicioTurno.eliminar(id);
		 return "Turno eliminado";
	 }

}
