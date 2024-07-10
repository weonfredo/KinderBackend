package kinder.kinder.service.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kinder.kinder.entity.Alumno;
import kinder.kinder.entity.Apoderado;
import kinder.kinder.entity.Aula;
import kinder.kinder.repository.AlumnoRepository;
import kinder.kinder.repository.ApoderadoRepository;
import kinder.kinder.repository.AulaRepository;
import kinder.kinder.request.AlumnoRequest;
import kinder.kinder.service.IAlumnoService;

@Service
public class AlumnoService implements IAlumnoService {

        @Autowired
        private AlumnoRepository alumnoRepository;

        @Autowired
        private AulaRepository aulaRepository;

        @Autowired
        private ApoderadoRepository apoderadoRepository;

        public List<Alumno> buscarTodos() {
                return alumnoRepository.findAll();
        }

        @Override
        public void guardar(AlumnoRequest registro) {

                if (alumnoRepository.findByDni(registro.getDni()).isPresent()) {
                        throw new IllegalArgumentException("El alumno con DNI " + registro.getDni() + " ya existe.");
                }

                Aula aula = aulaRepository.findById(registro.getId_aula())
                                .orElseThrow(() -> new IllegalArgumentException(
                                                "Aula no encontrada: " + registro.getId_aula()));
                Apoderado apoderado = apoderadoRepository.findById(registro.getId_apoderado())
                                .orElseThrow(() -> new IllegalArgumentException(
                                                "Apoderado no encontrado: " + registro.getId_apoderado()));

                Alumno alumno = new Alumno();
                alumno.setDni(registro.getDni());
                alumno.setNombres(registro.getNombres());
                alumno.setApellidos(registro.getApellidos());
                alumno.setFecha_nacimiento(registro.getFecha_nacimiento());
                alumno.setSexo(registro.getSexo());
                alumno.setLugar_nacimiento(registro.getLugar_nacimiento());
                alumno.setDireccion(registro.getDireccion());
                alumno.setEstado_financiero(registro.getEstado_financiero());
                alumno.setAula(aula);
                alumno.setApoderado(apoderado);

                alumnoRepository.save(alumno);

        }

        @Override
        public void modificar(AlumnoRequest registro) {

                Alumno alumno = alumnoRepository.findByDni(registro.getDni())
                                .orElseThrow(() -> new IllegalArgumentException(
                                                "El alumno con DNI " + registro.getDni() + " no existe."));

                Aula aula = aulaRepository.findById(registro.getId_aula())
                                .orElseThrow(() -> new IllegalArgumentException(
                                                "Aula no encontrada: " + registro.getId_aula()));
                Apoderado apoderado = apoderadoRepository.findById(registro.getId_apoderado())
                                .orElseThrow(() -> new IllegalArgumentException(
                                                "Apoderado no encontrado: " + registro.getId_apoderado()));

                alumno.setNombres(registro.getNombres());
                alumno.setApellidos(registro.getApellidos());
                alumno.setFecha_nacimiento(registro.getFecha_nacimiento());
                alumno.setSexo(registro.getSexo());
                alumno.setLugar_nacimiento(registro.getLugar_nacimiento());
                alumno.setDireccion(registro.getDireccion());
                alumno.setEstado_financiero(registro.getEstado_financiero());
                alumno.setAula(aula);
                alumno.setApoderado(apoderado);

                alumnoRepository.save(alumno);
        }

        @Override
        public Optional<Alumno> buscarId(String dni) {
                return Optional.ofNullable(alumnoRepository.findByDni(dni)
                                .orElseThrow(() -> new IllegalArgumentException(
                                                "El alumno con DNI " + dni + " no existe.")));
        }

        @Override
        public void eliminar(Integer id) {
                if (!alumnoRepository.existsById(id)) {
                        throw new IllegalArgumentException("El alumno con ID " + id + " no existe.");
                }
                alumnoRepository.deleteById(id);
        }

}
