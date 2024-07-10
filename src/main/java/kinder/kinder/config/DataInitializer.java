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
public class DataInitializer {

	@Bean
	CommandLineRunner initializeData(UsuarioRepository usuarioRepository, PasswordEncoder passwordEncoder,
			PerfilRepository perfilRepository) {
		return args -> {
			// Create ADMINISTRADOR profile and user
			if (!perfilRepository.existsByPerfil("ADMINISTRADOR")) {
				Perfil perfilAdmin = new Perfil();
				perfilAdmin.setPerfil("ADMINISTRADOR");
				perfilRepository.save(perfilAdmin);

				if (!usuarioRepository.existsByUsername("lramirezcenepo@gmail.com")) {
					Usuario usuarioAdmin = new Usuario();
					usuarioAdmin.setUsername("leandro");
					usuarioAdmin.setPassword(passwordEncoder.encode("12345678"));
					usuarioAdmin.setFirstname("Leandro Enrique");
					usuarioAdmin.setLastname("Ramírez Cenepo");
					usuarioAdmin.setEmail("lramirezcenepo@gmail.com");
					usuarioAdmin.setAddress("Tarapoto");
					usuarioAdmin.setNumberphone("968494861");
					usuarioAdmin.setPerfil(perfilAdmin);

					usuarioRepository.save(usuarioAdmin);
				}
			}

			// Create DUEÑO profile and user
			Perfil perfilDueno = perfilRepository.findByPerfil("DUEÑO").orElseGet(() -> {
				Perfil newPerfil = new Perfil();
				newPerfil.setPerfil("DUEÑO");
				return perfilRepository.save(newPerfil);
			});

			if (!usuarioRepository.existsByUsername("wilmar")) {
				Usuario usuarioDueno = new Usuario();
				usuarioDueno.setUsername("wilmar");
				usuarioDueno.setPassword(passwordEncoder.encode("123"));
				usuarioDueno.setFirstname("Wilmar Manuel");
				usuarioDueno.setLastname("Gomez Avalos");
				usuarioDueno.setEmail("wmanuelga@gmail.com");
				usuarioDueno.setAddress("Tarapoto");
				usuarioDueno.setNumberphone("941579343");
				usuarioDueno.setPerfil(perfilDueno);

				usuarioRepository.save(usuarioDueno);
			}

			// Create DIRECTOR profile and user
			Perfil perfilDirector = perfilRepository.findByPerfil("DIRECTOR").orElseGet(() -> {
				Perfil newPerfil = new Perfil();
				newPerfil.setPerfil("DIRECTOR");
				return perfilRepository.save(newPerfil);
			});

			if (!usuarioRepository.existsByUsername("abel")) {
				Usuario usuarioDirector = new Usuario();
				usuarioDirector.setUsername("abel");
				usuarioDirector.setPassword(passwordEncoder.encode("123"));
				usuarioDirector.setFirstname("Eduardo Abel");
				usuarioDirector.setLastname("Padilla Coral");
				usuarioDirector.setEmail("eduysting@gmail.com");
				usuarioDirector.setAddress("Tarapoto");
				usuarioDirector.setNumberphone("941579343");
				usuarioDirector.setPerfil(perfilDirector);

				usuarioRepository.save(usuarioDirector);
			}

			// Create PROFESOR profile and user
			Perfil perfilProfesor = perfilRepository.findByPerfil("PROFESOR").orElseGet(() -> {
				Perfil newPerfil = new Perfil();
				newPerfil.setPerfil("PROFESOR");
				return perfilRepository.save(newPerfil);
			});

			if (!usuarioRepository.existsByUsername("samir")) {
				Usuario usuarioProfesor = new Usuario();
				usuarioProfesor.setUsername("samir");
				usuarioProfesor.setPassword(passwordEncoder.encode("123"));
				usuarioProfesor.setFirstname("Paul Samir");
				usuarioProfesor.setLastname("Vidaurre Gonzales");
				usuarioProfesor.setEmail("samir@gmail.com");
				usuarioProfesor.setAddress("Tarapoto");
				usuarioProfesor.setNumberphone("941579343");
				usuarioProfesor.setPerfil(perfilProfesor);

				usuarioRepository.save(usuarioProfesor);
			}

			// Create SECRETARIA profile and user
			Perfil perfilSecretaria = perfilRepository.findByPerfil("SECRETARIA").orElseGet(() -> {
				Perfil newPerfil = new Perfil();
				newPerfil.setPerfil("SECRETARIA");
				return perfilRepository.save(newPerfil);
			});

			if (!usuarioRepository.existsByUsername("nik")) {
				Usuario usuarioSecretaria = new Usuario();
				usuarioSecretaria.setUsername("nik");
				usuarioSecretaria.setPassword(passwordEncoder.encode("123"));
				usuarioSecretaria.setFirstname("Nik David");
				usuarioSecretaria.setLastname("Navarro Garcia");
				usuarioSecretaria.setEmail("nik@gmail.com");
				usuarioSecretaria.setAddress("Tarapoto");
				usuarioSecretaria.setNumberphone("941579343");
				usuarioSecretaria.setPerfil(perfilSecretaria);

				usuarioRepository.save(usuarioSecretaria);
			}
		};
	}
}
