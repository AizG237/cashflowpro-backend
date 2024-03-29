package com.cashflowpro.cashflowpro.auth;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthentificationController {
    private final AuthenticationService service;
    @PostMapping("/register/employe")
    public ResponseEntity<?> register(@RequestBody RegisterRequestEmploye request){
        return ResponseEntity.ok(service.register(request));
    }

    @PostMapping("/register/client")
    public ResponseEntity<?> register(@RequestBody RegisterRequest request){
        return ResponseEntity.ok(service.register(request));
    }

    @PostMapping("/register/directeur")
    public ResponseEntity<?> register(@RequestBody RegisterRequestDirecteur request){
        return ResponseEntity.ok(service.register(request));
    }

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> authenticate(@RequestBody AuthenticationRequest request){
        return ResponseEntity.ok(service.register(request));
    }
    @GetMapping("/role")
    public ResponseEntity<?> listRoles(){return service.getAllRoles();
}

}
