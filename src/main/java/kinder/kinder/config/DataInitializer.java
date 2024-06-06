package kinder.kinder.config;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import kinder.kinder.entity.Rol;
import kinder.kinder.entity.Usuario;
import kinder.kinder.repository.UsuarioRepository;



@Configuration
public class DataInitializer 
{
	
    @Bean
    CommandLineRunner initializeData(UsuarioRepository usuarioRepository, PasswordEncoder passwordEncoder) 
    {
        return args ->
        {
        	
        	if (!usuarioRepository.existsByUsername("eduysting@gmail.com")) {
        	Usuario usuario = new Usuario();
    		usuario.setUsername("eduysting@gmail.com");
    		usuario.setPassword(passwordEncoder.encode("12345678"));
    		usuario.setFirstname("Eduardo Abel");
    		usuario.setLastname("Padilla Coral");
    		usuario.setEmail("eduysting@gmail.com");
    		usuario.setAddress("Tarapoto");
    		usuario.setNumberphone("921183257");
    		usuario.setRole(Rol.ADMIN);
        	
    			
    		usuarioRepository.save(usuario);
        	}
        };
    }
}
