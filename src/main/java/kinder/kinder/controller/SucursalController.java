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

import kinder.kinder.entity.Sucursal;
import kinder.kinder.request.SucursalRequest;
import kinder.kinder.service.ISucursalService;

@RestController
@RequestMapping("/sucursal")
public class SucursalController {
	@Autowired
	private ISucursalService servicioUsuario;
	
	@GetMapping("/todos")
	public List<Sucursal> buscarTodos(){
		return servicioUsuario.buscarTodos();
	}
	 @PostMapping("/registro")
	 public Sucursal guardar(@RequestBody SucursalRequest usuario) {
		 return servicioUsuario.guardar(usuario);
	 }
	 @PutMapping("/modificar")
	 public Sucursal modificar(@RequestBody SucursalRequest usuario) {
		 
		 return servicioUsuario.modificar(usuario);
	 }
	 @GetMapping("/buscar/{id}")
	 public Optional<Sucursal> buscarId(@PathVariable("id") Integer id){
		 return servicioUsuario.buscarId(id);
		 
	 }
	 @DeleteMapping("/eliminar/{id}")
	 public String eliminar(@PathVariable("id") Integer id) {
		 servicioUsuario.eliminar(id);
		 return "Sucursal eliminado";
	 }
}

