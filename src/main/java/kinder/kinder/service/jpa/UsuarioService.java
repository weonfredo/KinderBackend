package kinder.kinder.service.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import kinder.kinder.entity.Perfil;
import kinder.kinder.entity.Usuario;
import kinder.kinder.repository.PerfilRepository;
import kinder.kinder.repository.UsuarioRepository;
import kinder.kinder.request.UsuarioRequest;
import kinder.kinder.service.IUsuarioService;

@Service
public class UsuarioService implements IUsuarioService {
	@Autowired
	private UsuarioRepository usuarioRepository;

	@Autowired
	private PerfilRepository perfilRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	public List<Usuario> buscarTodos(){
		return usuarioRepository.findAll();
	}

	@Override
	public Usuario guardar(UsuarioRequest registro) {
		String encoded = passwordEncoder.encode(registro.getPassword());
		
		Usuario nuevousuario = new Usuario();
		
		nuevousuario.setFirstname(registro.getFirstname());
		nuevousuario.setLastname(registro.getLastname());
		nuevousuario.setAddress(registro.getAddress());
	    nuevousuario.setNumberphone(registro.getNumberphone());
		nuevousuario.setEmail(registro.getEmail());
		nuevousuario.setPassword(encoded);
		nuevousuario.setUsername(registro.getUsername());
		
		
		Perfil perfil = perfilRepository.findById(registro.getPerfil())
                .orElseThrow(() -> new RuntimeException("Perfil no encontrado"));
		
		
		nuevousuario.setPerfil(perfil);
		
		usuarioRepository.save(nuevousuario);
		return nuevousuario;
		
	}

	@Override
	public Usuario modificar(UsuarioRequest request) {
		Usuario empleado = usuarioRepository.findByUsername(request.getUsername()).orElse(null);
        if (empleado != null) {
        	
        	Perfil perfil = new Perfil();
        	if(request.getPerfil()!=null) {
        		
        		 perfil = perfilRepository.findById(request.getPerfil()).orElse(null);
        		
        	}

	    		if(request.getFirstname()!=null) {
	        		empleado.setFirstname(request.getFirstname());
	        	}
    		
	    		if(request.getLastname()!=null) {
	        		empleado.setLastname(request.getLastname());
	        	}
	    		
	    		if(request.getEmail()!=null) {
            		empleado.setEmail(request.getEmail());
            	}
	    		
	    		if(request.getNumberphone()!=null) {
            		empleado.setNumberphone(request.getNumberphone());
            	}
	    		
            	if(request.getAddress()!=null) {
            		empleado.setAddress(request.getAddress());
            	}
            	
            	if(request.getPassword()!=null) {
            		empleado.setPassword(request.getPassword());
            	}
            	
            	if(request.getPerfil()!=null) {
            		empleado.setPerfil(perfil);
            	}
            	
                usuarioRepository.save(empleado);
			
		}
		return empleado;
	}

	@Override
	public Optional<Usuario> buscarId(Integer id) {
		
		return usuarioRepository.findById(id);
	}

	@Override
	public void eliminar(Integer id) {
		usuarioRepository.deleteById(id);
		
	}
}
