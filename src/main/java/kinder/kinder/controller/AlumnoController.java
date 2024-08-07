package kinder.kinder.controller;

import java.util.Collections;
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
import kinder.kinder.entity.Usuario;
import kinder.kinder.repository.AlumnoRepository;
import kinder.kinder.request.AlumnoRequest;
import kinder.kinder.service.IAlumnoService;

@RestController
@RequestMapping("/alumno")
public class AlumnoController {

	@Autowired
	IAlumnoService servicioAlumno;
	@Autowired
	private AlumnoRepository alumnoRepository;

	@GetMapping("/todos")
	public List<Alumno> buscarTodos() {
		return servicioAlumno.buscarTodos();
	}

	@PostMapping("/registro")
	public AlumnoRequest guardar(@RequestBody AlumnoRequest alumno) {
		servicioAlumno.guardar(alumno);
		return alumno;
	}

	@PutMapping("/modificar")
	public AlumnoRequest modificar(@RequestBody AlumnoRequest alumno) {
		servicioAlumno.modificar(alumno);
		return alumno;
	}

	@GetMapping("/buscar/{dni}")
	public Optional<Alumno> buscarId(@PathVariable("dni") String dni) {
		return servicioAlumno.buscarId(dni);

	}

	@DeleteMapping("/eliminar/{id}")
	public String eliminar(@PathVariable("id") Integer id) {
		servicioAlumno.eliminar(id);
		return "Alumno eliminado";
	}

	@GetMapping("/usuario/{dni}")
	public List<Alumno> getEmpleado(@PathVariable String dni) {
		Optional<Alumno> optionalEmpleado = alumnoRepository.findByDni(dni);
		return optionalEmpleado.map(Collections::singletonList).orElse(Collections.emptyList());
	}

}
