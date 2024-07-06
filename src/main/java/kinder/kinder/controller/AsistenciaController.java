package kinder.kinder.controller;
import kinder.kinder.entity.Alumno;
import kinder.kinder.entity.Asistencia;
import kinder.kinder.service.jpa.AlumnoService;
import kinder.kinder.service.jpa.AsistenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class AsistenciaController {

    @Autowired
    private AlumnoService alumnoService;

    @Autowired
    private AsistenciaService asistenciaService;

    @GetMapping("/asistencias")
    public String getAsistencias(Model model) {
        List<Alumno> alumnos = alumnoService.buscarTodos();
        model.addAttribute("alumnos", alumnos);
        return "asistencias";
    }

    @PostMapping("/asistencias")
    public String saveAsistencias(Model model, String[] alumnoIds, String[] estados) {
        for (int i = 0; i < alumnoIds.length; i++) {
            Integer alumnoId = Integer.parseInt(alumnoIds[i]);
            Alumno alumno = new Alumno();
            alumno.setId(alumnoId);
            
            Asistencia asistencia = new Asistencia();
            asistencia.setAlumno(alumno);
            asistencia.setFecha(new Date());
            asistencia.setEstado(estados[i]);

            asistenciaService.save(asistencia);
        }
        return "redirect:/asistencias";
    }
}