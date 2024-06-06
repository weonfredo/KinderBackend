package kinder.kinder.service;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import kinder.kinder.entity.Rol;
import kinder.kinder.entity.Usuario;
import kinder.kinder.repository.UsuarioRepository;
import kinder.kinder.request.AuthResponse;
import kinder.kinder.request.LoginRequest;
import kinder.kinder.request.RegisterRequest;

@Service

public class AuthService {

	private final UsuarioRepository usuarioRepository;
	private final JwtService jwtService;
	private final PasswordEncoder passwordEncoder;
	private final AuthenticationManager authenticationManager;

	public AuthService(UsuarioRepository usuarioRepository, JwtService jwtService,
			PasswordEncoder passwordEncoder, AuthenticationManager authenticationManager) {

		this.usuarioRepository = usuarioRepository;
		this.jwtService = jwtService;
		this.passwordEncoder = passwordEncoder;
		this.authenticationManager = authenticationManager;
	}

	// public AuthResponse login(LoginRequest request) {
	// authenticationManager.authenticate(new
	// UsernamePasswordAuthenticationToken(request.getUsername(),
	// request.getPassword()));
	// Usuario usuario =
	// usuarioRepository.findByUsername(request.getUsername()).orElseThrow();
	// AuthResponse authResponse = new AuthResponse();
	// authResponse.setToken(jwtService.getToken(usuario));
	// return authResponse;

	// }
	public AuthResponse login(LoginRequest request) {
		try {
			authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
			Usuario usuario = usuarioRepository.findByUsername(request.getUsername()).orElseThrow();
			AuthResponse authResponse = new AuthResponse();
			authResponse.setToken(jwtService.getToken(usuario));
			return authResponse;
		} catch (AuthenticationException e) {
			// La autenticación falló, puedes manejar este caso según tus necesidades
			throw new RuntimeException("Invalid username or password");
		}
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
		usuario.setRole(Rol.USER);

		usuarioRepository.save(usuario);

		AuthResponse auth = new AuthResponse();
		auth.setToken(jwtService.getToken(usuario));
		return auth;
	}
	/*
	 * public void registerPerfil(RegisterPerfilRequest request) {
	 * Perfil perfil = new Perfil();
	 * perfil.setNombre(request.getPerfil());
	 * perfilRepository.save(perfil);
	 * 
	 * }
	 * 
	 * public void agregarPerfilAEmpleado(AgregarPerfilEmpleadoRequest request) {
	 * Empleado empleado =
	 * empleadoRepository.findByUsername(request.getUsername()).orElse(null);
	 * if (empleado != null) {
	 * Set<Perfil> perfilActual = empleado.getPerfiles();
	 * Set<Perfil> perfilesNuevos = new HashSet<>();
	 * Optional<Perfil> perfilOptional =
	 * perfilRepository.findByNombre(request.getPerfil());
	 * if (perfilOptional.isPresent()) {
	 * Perfil perfilEncontrado = perfilOptional.get();
	 * perfilesNuevos.add(perfilEncontrado);
	 * } else {
	 * throw new RuntimeException("Error: El perfil no fue encontrado");
	 * }
	 * if (perfilesNuevos != null) {
	 * perfilActual.addAll(perfilesNuevos);
	 * empleado.setPerfiles(perfilActual);
	 * empleadoRepository.save(empleado);
	 * }
	 * }
	 * }
	 * public void editarEmpleado(EditarEmpleadoRequest request) {
	 * Empleado empleado =
	 * empleadoRepository.findByUsername(request.getUsername()).orElse(null);
	 * if (empleado != null) {
	 * 
	 * Set<Perfil> perfil = new HashSet<>();
	 * if(request.getPerfil()!=null) {
	 * 
	 * Optional<Perfil> perfilOptional =
	 * perfilRepository.findByNombre(request.getPerfil());
	 * if (perfilOptional.isPresent()) {
	 * Perfil perfilEncontrado = perfilOptional.get();
	 * perfil.add(perfilEncontrado);
	 * } else {
	 * throw new RuntimeException("Error: El perfil no fue encontrado");
	 * }
	 * }
	 * 
	 * if(request.getFirstname()!=null) {
	 * empleado.setFirstname(request.getFirstname());
	 * }
	 * 
	 * if(request.getLastname()!=null) {
	 * empleado.setLastname(request.getLastname());
	 * }
	 * 
	 * if(request.getEmail()!=null) {
	 * empleado.setEmail(request.getEmail());
	 * }
	 * 
	 * if(request.getNumberphone()!=null) {
	 * empleado.setNumberphone(request.getNumberphone());
	 * }
	 * 
	 * if(request.getAddress()!=null) {
	 * empleado.setAddress(request.getAddress());
	 * }
	 * 
	 * if(request.getPassword()!=null) {
	 * empleado.setPassword(request.getPassword());
	 * }
	 * 
	 * if(request.getPerfil()!=null) {
	 * empleado.setPerfiles(perfil);
	 * }
	 * 
	 * empleadoRepository.save(empleado);
	 * 
	 * }
	 * }
	 * 
	 * public void eliminarEmpleado(Integer id) {
	 * empleadoRepository.deleteById(id);
	 * }
	 */

}
