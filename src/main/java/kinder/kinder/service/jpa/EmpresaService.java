package kinder.kinder.service.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kinder.kinder.entity.Empresa;
import kinder.kinder.repository.EmpresaRepository;
import kinder.kinder.service.IEmpresaService;

@Service
public class EmpresaService implements IEmpresaService{
    @Autowired
	private EmpresaRepository repoCurso;

	public List<Empresa> buscarTodos(){
		return repoCurso.findAll();
	}
	
	public Empresa guardar(Empresa curso) {
		repoCurso.save(curso);
        return curso;
	}
	
	public Empresa modificar(Empresa curso) {
		repoCurso.save(curso);
        return curso;
	}
	
	public Optional<Empresa> buscarId(Integer id){
		return repoCurso.findById(id);
	}
	
	public void eliminar(Integer id) {
		repoCurso.deleteById(id);
	}
}
