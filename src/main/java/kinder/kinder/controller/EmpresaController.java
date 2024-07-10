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

import kinder.kinder.entity.Empresa;
import kinder.kinder.service.IEmpresaService;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {

	@Autowired
	IEmpresaService servicioCompetencia;

	@GetMapping("/todos")
	public List<Empresa> buscarTodos(){
		return servicioCompetencia.buscarTodos();
	}
	
	@PostMapping("/registro")
	 public Empresa guardar(@RequestBody Empresa competencia) {
		servicioCompetencia.guardar(competencia);
		 return competencia;
	 }
	 @PutMapping("/modificar")
	 public Empresa modificar(@RequestBody Empresa competencia) {
		 servicioCompetencia.modificar(competencia);
		 return competencia;
	 }
	 @GetMapping("/buscar/{id}")
	 public Optional<Empresa> buscarId(@PathVariable("id") Integer id){
		 return servicioCompetencia.buscarId(id);
		 
	 }
	 @DeleteMapping("/eliminar/{id}")
	 public String eliminar(@PathVariable("id") Integer id) {
		 servicioCompetencia.eliminar(id);
		 return "Empresa eliminada";
	 }

	}