package com.cashflowpro.cashflowpro.auth;

import com.cashflowpro.cashflowpro.config.JwtService;
import com.cashflowpro.cashflowpro.modele.Role;
import com.cashflowpro.cashflowpro.modele.Utilisateur;
import com.cashflowpro.cashflowpro.repository.RoleRepository;
import com.cashflowpro.cashflowpro.repository.UtilisateurRepository;
import jakarta.persistence.GeneratedValue;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AuthenticationService {
    private final UtilisateurRepository repository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;
    private final RoleRepository roleRepository;

    public ResponseEntity<?> getAllRoles(){
        return ResponseEntity.status(200).body(roleRepository.findAll());
}

    public ResponseEntity<?> register(RegisterRequest request) {
        Optional<Role> role = roleRepository.findByRoleName(request.getRole().toUpperCase());
        if (role.isPresent()){
       var user = Utilisateur.builder()
               .nom(request.getFirstname())
               .prenom(request.getLastname())
               .email(request.getEmail())
               .pwd(passwordEncoder.encode(request.getPassword()))
               .role(role.get())               //.compte(0)
               .datenaiss(request.getDatenaiss())
               .telephone(request.getTelephone())
               .build();
       repository.save(user);
       var jwtToken = jwtService.generateToken(user);
        AuthenticationResponse.builder()
               .token(jwtToken)
               .build();
            return ResponseEntity.status(200).body(request);
        }else {
            return ResponseEntity.status(403).body("Le role "+request.getRole()+"n'existe pas");
        }
    }
    public AuthenticationResponse register(AuthenticationRequest request) {
       authenticationManager.authenticate(
               new UsernamePasswordAuthenticationToken(
                       request.getEmail(),
                       request.getPassword()
               )
       );
               var user = repository.findByEmail(request.getEmail()).orElseThrow();

        var jwtToken = jwtService.generateToken(user);
        return AuthenticationResponse.builder()
                .token(jwtToken)
                .build();

    }
}
