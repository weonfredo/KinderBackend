package kinder.kinder.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kinder.kinder.request.AuthResponse;
import kinder.kinder.request.LoginRequest;
import kinder.kinder.request.RegisterRequest;
import kinder.kinder.service.AuthService;


@RestController
@RequestMapping("/auth")
public class AuthController {
    
    public AuthController(AuthService authService) {
		super();
		this.authService = authService;
	}

	private final AuthService authService;
    
    @PostMapping(value = "login")
    public ResponseEntity<AuthResponse> login(@RequestBody LoginRequest request)
    {
        return ResponseEntity.ok(authService.login(request));
    }

    @PostMapping(value = "register")
    public ResponseEntity<AuthResponse> register(@RequestBody RegisterRequest request)
    {
        return ResponseEntity.ok(authService.register(request));
    }
}