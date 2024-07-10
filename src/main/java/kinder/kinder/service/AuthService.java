package kinder.kinder.service;


import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import kinder.kinder.entity.Perfil;
import kinder.kinder.entity.Usuario;
import kinder.kinder.repository.PerfilRepository;
import kinder.kinder.repository.UsuarioRepository;
import kinder.kinder.request.AuthResponse;
import kinder.kinder.request.LoginRequest;
import kinder.kinder.request.RegisterRequest;



@Service

public class AuthService {	
	
	
	private final UsuarioRepository usuarioRepository;
	private final PerfilRepository perfilRepository;
	private final JwtService jwtService;
	private final PasswordEncoder passwordEncoder;
	private final AuthenticationManager authenticationManager;
	
	public AuthService(UsuarioRepository usuarioRepository, JwtService jwtService,
			PasswordEncoder passwordEncoder, AuthenticationManager authenticationManager, PerfilRepository perfilRepository) {
		this.usuarioRepository = usuarioRepository;
		this.perfilRepository = perfilRepository;
		this.jwtService = jwtService;
		this.passwordEncoder = passwordEncoder;
		this.authenticationManager = authenticationManager;
	}

	public AuthResponse login(LoginRequest request) {
		authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
		Usuario usuario = usuarioRepository.findByUsername(request.getUsername()).orElseThrow();
		AuthResponse authResponse = new AuthResponse();
	    authResponse.setToken(jwtService.getToken(usuario));
	    return authResponse;

	}

	public AuthResponse register(RegisterRequest request) {
		
		if (usuarioRepository.existsByUsername(request.getUsername())) {

			throw new RuntimeException("Este usuario ya existe!");
	    }

	    Usuario usuario = new Usuario();
	    usuario.setUsername(request.getUsername());
	    usuario.setPassword(passwordEncoder.encode(request.getPassword()));
	    usuario.setFirstname(request.getFirstname());
	    usuario.setLastname(request.getLastname());
	    usuario.setEmail(request.getEmail());
	    usuario.setAddress(request.getAddress());
	    usuario.setNumberphone(request.getNumberphone());
	    Perfil perfil = perfilRepository.findByPerfil(request.getPerfil()).orElseThrow();
	    usuario.setPerfil(perfil);
	    usuarioRepository.save(usuario);
	    AuthResponse auth = new AuthResponse();
	    auth.setToken(jwtService.getToken(usuario));
	    return auth;
	}
	

}
