package kinder.kinder.controller;

import kinder.kinder.entity.Alumno;
import kinder.kinder.entity.Competencia;
import kinder.kinder.entity.Curso;
import kinder.kinder.entity.Nota;
import kinder.kinder.repository.AlumnoRepository;
import kinder.kinder.service.jpa.AlumnoService;
import kinder.kinder.service.jpa.CompetenciaService;
import kinder.kinder.service.jpa.CursoService;
import kinder.kinder.service.jpa.NotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/nota")
public class NotasController {

    @Autowired
    private AlumnoService alumnoService;

    @Autowired
    private NotaService notaService;

    @Autowired
    private CompetenciaService competenciaService;

    @Autowired
    private CursoService cursoService;
    
    @Autowired
    private AlumnoRepository alumnoRepository;

    @GetMapping("/notas")
    public String getNotas(Model model) {
        List<Alumno> alumnos = alumnoService.buscarTodos();
        List<Competencia> competencias = competenciaService.buscarTodos();
        List<Curso> cursos = cursoService.buscarTodos();
        model.addAttribute("alumnos", alumnos);
        model.addAttribute("competencias", competencias);
        model.addAttribute("cursos", cursos);
        return "notas";
    }

    @PostMapping("/notas")
    public String saveNotas(@RequestParam("alumnoIds") String[] alumnoIds,
				            @RequestParam("notas") Double[] notas,
				            @RequestParam("competenciaIds") Integer[] competenciaIds,
				            @RequestParam("cursoIds") Integer[] cursoIds) {
			for (int i = 0; i < alumnoIds.length; i++) {
			Integer alumnoId = Integer.parseInt(alumnoIds[i]);
			Optional<Alumno> optionalAlumno = alumnoRepository.findById(alumnoId);
			if (optionalAlumno.isPresent()) {
			Alumno alumno = optionalAlumno.get();
			
			// Guardar nota
			Nota nota = new Nota();
			nota.setAlumno(alumno);
			nota.setValor(notas[i]);
			Competencia competencia = new Competencia();
			competencia.setId(competenciaIds[i]);
			nota.setCompetencia(competencia);
			Curso curso = new Curso();
			curso.setId(cursoIds[i]);
			nota.setCurso(curso);
			notaService.save(nota);
			}
			}
			return "redirect:/notas";
			}
}