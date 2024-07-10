/*
package kinder.kinder.config;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import kinder.kinder.entity.Perfil;
import kinder.kinder.entity.Usuario;
import kinder.kinder.repository.PerfilRepository;
import kinder.kinder.repository.UsuarioRepository;



@Configuration
public class DataInitializer 
{
	
    @Bean
    CommandLineRunner initializeData(UsuarioRepository usuarioRepository, PasswordEncoder passwordEncoder, PerfilRepository perfilRepository) 
    {
        return args ->
        {	
        	if (!perfilRepository.existsByPerfil("ADMINISTRADOR")) {
        	Perfil perfil = new Perfil();
        	perfil.setPerfil("ADMINISTRADOR");
        	perfilRepository.save(perfil);
        	perfil = perfilRepository.findByPerfil("ADMINISTRADOR").orElseThrow();
        	if (!usuarioRepository.existsByUsername("leandro")) {
        	Usuario usuario = new Usuario();
    		usuario.setUsername("lramirezcenepo@gmail.com");
    		usuario.setPassword(passwordEncoder.encode("12345678"));
    		usuario.setFirstname("Leandro Enrique");
    		usuario.setLastname("Ramírez Cenepo");
    		usuario.setEmail("lramirezcenepo@gmail.com");
    		usuario.setAddress("Tarapoto");
    		usuario.setNumberphone("968494861");
    		usuario.setPerfil(perfil);
        	
    			
    		usuarioRepository.save(usuario);
        	}
        	}
        };
    }
}
*/