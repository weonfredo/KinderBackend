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


import kinder.kinder.entity.Seccion;
import kinder.kinder.service.ISeccionService;

@RestController
@RequestMapping("/seccion")
public class SeccionController {

	@Autowired
	ISeccionService servicioSeccion;

	@GetMapping("/todos")
	public List<Seccion> buscarTodos(){
		return servicioSeccion.buscarTodos();
	}
	
	@PostMapping("/registro")
	 public Seccion guardar(@RequestBody Seccion seccion) {
		servicioSeccion.guardar(seccion);
		 return seccion;
	 }
	 @PutMapping("/modificar")
	 public Seccion modificar(@RequestBody Seccion seccion) {
		 servicioSeccion.modificar(seccion);
		 return seccion;
	 }
	 @GetMapping("/buscar/{id}")
	 public Optional<Seccion> buscarId(@PathVariable("id") Integer id){
		 return servicioSeccion.buscarId(id);
		 
	 }
	 @DeleteMapping("/eliminar/{id}")
	 public String eliminar(@PathVariable("id") Integer id) {
		 servicioSeccion.eliminar(id);
		 return "Seccion eliminado";
	 }


}
