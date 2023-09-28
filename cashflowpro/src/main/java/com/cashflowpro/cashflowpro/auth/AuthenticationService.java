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
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AuthenticationService implements UserDetailsService {
    private final UtilisateurRepository repository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;
    private final RoleRepository roleRepository;

    public ResponseEntity<?> getAllRoles(){
        return ResponseEntity.status(200).body(roleRepository.findAll());
}
//CLIENT
    public ResponseEntity<?> register(RegisterRequest request) {
        Optional<Role> role = roleRepository.findByRoleName(request.getRole().toUpperCase());
        if (role.isPresent() && !repository.findByEmail(request.getEmail()).isPresent()){
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
        }else if(repository.findByEmail(request.getEmail()).isPresent()) {

            return ResponseEntity.status(403).body("Le compte"+request.getEmail()+"existe déjà");
        }else{
            return ResponseEntity.status(403).body("Le role "+request.getRole()+"n'existe pas");
        }
    }

    //EMPLOYE
    public ResponseEntity<?> register(RegisterRequestEmploye request) {
        Optional<Role> role = roleRepository.findByRoleName(request.getRole().toUpperCase());
        if (!repository.findByEmail(request.getEmail()).isPresent() && role.equals(roleRepository.findByRoleName("EMPLOYE"))){
            var user = Utilisateur.builder()
                    .matricule(request.getMatricule())
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
        }else if(repository.findByEmail(request.getEmail()).isPresent()) {

            return ResponseEntity.status(403).body("Le compte"+request.getEmail()+"existe déjà");
        }else{
            return ResponseEntity.status(403).body("Le role "+request.getRole()+"n'existe pas");
        }
    }

    //DIRECTEUR
    public ResponseEntity<?> register(RegisterRequestDirecteur request) {
        Optional<Role> role = roleRepository.findByRoleName(request.getRole().toUpperCase());
        if (!repository.findByEmail(request.getEmail()).isPresent() && role.equals(roleRepository.findByRoleName("DIRECTEUR"))){
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
        }else if(repository.findByEmail(request.getEmail()).isPresent()) {

            return ResponseEntity.status(403).body("Le compte"+request.getEmail()+"existe déjà");
        }else{
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
                .role(user.getRole().getNom_role())
                .build();

    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Utilisateur> utilisateur = repository.findByEmail(username);
        if (utilisateur.isPresent()){
            return new UserDetails() {
                @Override
                public Collection<? extends GrantedAuthority> getAuthorities() {
                    return utilisateur.get().getAuthorities();
                }

                @Override
                public String getPassword() {
                    return utilisateur.get().getPassword();
                }

                @Override
                public String getUsername() {
                    return utilisateur.get().getEmail();
                }

                @Override
                public boolean isAccountNonExpired() {
                    return false;
                }

                @Override
                public boolean isAccountNonLocked() {
                    return false;
                }

                @Override
                public boolean isCredentialsNonExpired() {
                    return false;
                }

                @Override
                public boolean isEnabled() {
                    return false;
                }
            };
        }else {
            throw new UsernameNotFoundException("No Such User");
        }
    }
}
