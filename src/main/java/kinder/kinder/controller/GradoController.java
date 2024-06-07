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

import kinder.kinder.entity.Grado;
import kinder.kinder.service.IGradoService;

@RestController
@RequestMapping("/grado")
public class GradoController {

	@Autowired
	IGradoService servicioGrado;

	@GetMapping("/todos")
	public List<Grado> buscarTodos(){
		return servicioGrado.buscarTodos();
	}
	
	@PostMapping("/registro")
	 public Grado guardar(@RequestBody Grado grado) {
		servicioGrado.guardar(grado);
		 return grado;
	 }
	 @PutMapping("/modificar")
	 public Grado modificar(@RequestBody Grado grado) {
		 servicioGrado.modificar(grado);
		 return grado;
	 }
	 @GetMapping("/buscar/{id}")
	 public Optional<Grado> buscarId(@PathVariable("id") Integer id){
		 return servicioGrado.buscarId(id);
		 
	 }
	 @DeleteMapping("/eliminar/{id}")
	 public String eliminar(@PathVariable("id") Integer id) {
		 servicioGrado.eliminar(id);
		 return "Grado eliminado";
	 }


}
