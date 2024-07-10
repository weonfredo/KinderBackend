package kinder.kinder.service.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kinder.kinder.entity.Empresa;
import kinder.kinder.entity.Sucursal;
import kinder.kinder.repository.EmpresaRepository;
import kinder.kinder.repository.SucursalRepository;
import kinder.kinder.request.SucursalRequest;
import kinder.kinder.service.ISucursalService;

@Service
public class SucursalService implements ISucursalService{
    @Autowired
	private SucursalRepository usuarioRepository;

	@Autowired
	private EmpresaRepository perfilRepository;
	
	
	public List<Sucursal> buscarTodos(){
		return usuarioRepository.findAll();
	}

	@Override
	public Sucursal guardar(SucursalRequest registro) {
		
		Sucursal nuevousuario = new Sucursal();
		
		nuevousuario.setNombre(registro.getNombre());
		nuevousuario.setCodigo(registro.getCodigo());
		nuevousuario.setDireccion(registro.getDireccion());
	    nuevousuario.setTelefono(registro.getTelefono());
		nuevousuario.setEmail(registro.getEmail());
		
		
		Empresa perfil = perfilRepository.findById(registro.getEmpresa())
                .orElseThrow(() -> new RuntimeException("Empresa no encontrado"));
		
		
		nuevousuario.setEmpresa(perfil);
		
		usuarioRepository.save(nuevousuario);
		return nuevousuario;
		
	}

	@Override
	public Sucursal modificar(SucursalRequest request) {
		Sucursal empleado = usuarioRepository.findByNombre(request.getNombre()).orElse(null);
        if (empleado != null) {
        	
        	Empresa perfil = new Empresa();
        	if(request.getEmpresa()!=null) {
        		
        		 perfil = perfilRepository.findById(request.getEmpresa()).orElse(null);
        		
        	}

	    		if(request.getNombre()!=null) {
	        		empleado.setNombre(request.getNombre());
	        	}
    		
	    		if(request.getCodigo()!=null) {
	        		empleado.setCodigo(request.getCodigo());
	        	}
	    		
	    		if(request.getEmail()!=null) {
            		empleado.setEmail(request.getEmail());
            	}
	    		
	    		if(request.getTelefono()!=null) {
            		empleado.setTelefono(request.getTelefono());
            	}
	    		
            	if(request.getDireccion()!=null) {
            		empleado.setDireccion(request.getDireccion());
            	}
            	
            	if(request.getEmpresa()!=null) {
            		empleado.setEmpresa(perfil);
            	}
            	
                usuarioRepository.save(empleado);
			
		}
		return empleado;
	}

	@Override
	public Optional<Sucursal> buscarId(Integer id) {
		
		return usuarioRepository.findById(id);
	}

	@Override
	public void eliminar(Integer id) {
		usuarioRepository.deleteById(id);
		
	}
}
