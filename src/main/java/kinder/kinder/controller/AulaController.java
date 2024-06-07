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

import kinder.kinder.entity.Aula;
import kinder.kinder.service.IAulaService;


@RestController
@RequestMapping("/aula")
public class AulaController {
	
	@Autowired
	IAulaService servicioAula;

	@GetMapping("/todos")
	public List<Aula> buscarTodos(){
		return servicioAula.buscarTodos();
	}
	
	@PostMapping("/registro")
	 public Aula guardar(@RequestBody Aula aula) {
		servicioAula.guardar(aula);
		 return aula;
	 }
	 @PutMapping("/modificar")
	 public Aula modificar(@RequestBody Aula aula) {
		 servicioAula.modificar(aula);
		 return aula;
	 }
	 @GetMapping("/buscar/{id}")
	 public Optional<Aula> buscarId(@PathVariable("id") Integer id){
		 return servicioAula.buscarId(id);
		 
	 }
	 @DeleteMapping("/eliminar/{id}")
	 public String eliminar(@PathVariable("id") Integer id) {
		 servicioAula.eliminar(id);
		 return "Aula eliminado";
	 }

}
