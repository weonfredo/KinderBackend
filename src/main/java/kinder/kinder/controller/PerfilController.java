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

import kinder.kinder.entity.Perfil;
import kinder.kinder.service.IPerfilService;


@RestController
@RequestMapping("/perfil")
public class PerfilController {
	@Autowired
	private IPerfilService servicioPerfil;
	
	@GetMapping("/todos")
	public List<Perfil> buscarTodos(){
		return servicioPerfil.buscarTodos();
	}
	 @PostMapping("/registro")
	 public Perfil guardar(@RequestBody Perfil perfil) {
		 servicioPerfil.guardar(perfil);
		 return perfil;
	 }
	 @PutMapping("/modificar")
	 public Perfil modificar(@RequestBody Perfil perfil) {
		 servicioPerfil.modificar(perfil);
		 return perfil;
	 }
	 @GetMapping("/buscar/{id}")
	 public Optional<Perfil> buscarId(@PathVariable("id") Integer id){
		 return servicioPerfil.buscarId(id);
		 
	 }
	 @DeleteMapping("/eliminar/{id}")
	 public String eliminar(@PathVariable("id") Integer id) {
		 servicioPerfil.eliminar(id);
		 return "Usuario eliminado";
	 }
}
