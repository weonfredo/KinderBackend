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

import kinder.kinder.entity.Alumno;
import kinder.kinder.service.IAlumnoService;

@RestController
@RequestMapping("/alumno")
public class AlumnoController {

	@Autowired
	IAlumnoService servicioAlumno;

	@GetMapping("/todos")
	public List<Alumno> buscarTodos(){
		return servicioAlumno.buscarTodos();
	}
	
	@PostMapping("/registro")
	 public Alumno guardar(@RequestBody Alumno alumno) {
		servicioAlumno.guardar(alumno);
		 return alumno;
	 }
	 @PutMapping("/modificar")
	 public Alumno modificar(@RequestBody Alumno alumno) {
		 servicioAlumno.modificar(alumno);
		 return alumno;
	 }
	 @GetMapping("/buscar/{id}")
	 public Optional<Alumno> buscarId(@PathVariable("id") Integer id){
		 return servicioAlumno.buscarId(id);
		 
	 }
	 @DeleteMapping("/eliminar/{id}")
	 public String eliminar(@PathVariable("id") Integer id) {
		 servicioAlumno.eliminar(id);
		 return "Alumno eliminado";
	 }

	}

