package com.cashflowpro.cashflowpro.modele;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "utilisateur")
@AllArgsConstructor
@Data
@Builder

public class Utilisateur implements UserDetails {

    public Utilisateur(){

    }
    public enum Role{
        DIRECTEUR,
        EMPLOYE,
        CLIENT
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long matricule;
    @Column(length = 40)
    protected String nom;
    @Column(length = 40)
    protected String prenom;
    @Column(length = 40)
    protected String email;
    @Column()
    protected String pwd;

    @Column
    protected float compte;
    @Column
    protected Date datenaiss;
    @Column
    protected long telephone;
    @ManyToMany
    @JoinTable(name = "planepargne",
            joinColumns = @JoinColumn(name = "matricule"),
            inverseJoinColumns = @JoinColumn(name = "id_planinvest"))
    private List<PlanInvest> planInvests;
    private Role role;


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority(role.name()));
    }

    @Override
    public String getPassword() {
        return pwd;
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
