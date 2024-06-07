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

import kinder.kinder.entity.Curso;
import kinder.kinder.service.ICursoService;
@RestController
@RequestMapping("/curso")
public class CursoController {
	@Autowired
	ICursoService servicioCurso;

	@GetMapping("/todos")
	public List<Curso> buscarTodos(){
		return servicioCurso.buscarTodos();
	}
	
	@PostMapping("/registro")
	 public Curso guardar(@RequestBody Curso curso) {
		servicioCurso.guardar(curso);
		 return curso;
	 }
	 @PutMapping("/modificar")
	 public Curso modificar(@RequestBody Curso curso) {
		 servicioCurso.modificar(curso);
		 return curso;
	 }
	 @GetMapping("/buscar/{id}")
	 public Optional<Curso> buscarId(@PathVariable("id") Integer id){
		 return servicioCurso.buscarId(id);
		 
	 }
	 @DeleteMapping("/eliminar/{id}")
	 public String eliminar(@PathVariable("id") Integer id) {
		 servicioCurso.eliminar(id);
		 return "Competencia eliminada";
	 }

	}