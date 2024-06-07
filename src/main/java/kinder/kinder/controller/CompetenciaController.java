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

import kinder.kinder.entity.Competencia;
import kinder.kinder.service.ICompetenciaService;

@RestController
@RequestMapping("/competencia")
public class CompetenciaController {

	@Autowired
	ICompetenciaService servicioCompetencia;

	@GetMapping("/todos")
	public List<Competencia> buscarTodos(){
		return servicioCompetencia.buscarTodos();
	}
	
	@PostMapping("/registro")
	 public Competencia guardar(@RequestBody Competencia competencia) {
		servicioCompetencia.guardar(competencia);
		 return competencia;
	 }
	 @PutMapping("/modificar")
	 public Competencia modificar(@RequestBody Competencia competencia) {
		 servicioCompetencia.modificar(competencia);
		 return competencia;
	 }
	 @GetMapping("/buscar/{id}")
	 public Optional<Competencia> buscarId(@PathVariable("id") Integer id){
		 return servicioCompetencia.buscarId(id);
		 
	 }
	 @DeleteMapping("/eliminar/{id}")
	 public String eliminar(@PathVariable("id") Integer id) {
		 servicioCompetencia.eliminar(id);
		 return "Competencia eliminada";
	 }

	}