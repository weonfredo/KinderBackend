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

import kinder.kinder.entity.Usuario;
import kinder.kinder.request.UsuarioRequest;
import kinder.kinder.service.IUsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	@Autowired
	private IUsuarioService servicioUsuario;
	
	@GetMapping("/todos")
	public List<Usuario> buscarTodos(){
		return servicioUsuario.buscarTodos();
	}
	 @PostMapping("/registro")
	 public Usuario guardar(@RequestBody UsuarioRequest usuario) {
		 return servicioUsuario.guardar(usuario);
	 }
	 @PutMapping("/modificar")
	 public Usuario modificar(@RequestBody UsuarioRequest usuario) {
		 
		 return servicioUsuario.modificar(usuario);
	 }
	 @GetMapping("/buscar/{id}")
	 public Optional<Usuario> buscarId(@PathVariable("id") Integer id){
		 return servicioUsuario.buscarId(id);
		 
	 }
	 @DeleteMapping("/eliminar/{id}")
	 public String eliminar(@PathVariable("id") Integer id) {
		 servicioUsuario.eliminar(id);
		 return "Usuario eliminado";
	 }
}
