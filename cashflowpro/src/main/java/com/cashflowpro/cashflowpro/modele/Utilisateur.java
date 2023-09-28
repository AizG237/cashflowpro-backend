package com.cashflowpro.cashflowpro.modele;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "utilisateur")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder

public class Utilisateur implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_utilisateur;
    @Column
    private String matricule;
    @Column(length = 40)
    protected String nom;
    @Column(length = 40)
    protected String prenom;
    @Column(length = 40)
    private String email;
    @Column()
    protected String pwd;
    @Column
    private float salaire;

    @Column
    protected Date datenaiss;
    @Column
    protected long telephone;
    @ManyToMany
    @JoinTable(name = "planepargne",
            joinColumns = @JoinColumn(name = "matricule"),
            inverseJoinColumns = @JoinColumn(name = "id_planinvest"))
    private List<PlanInvest> planInvests;

    @ManyToOne(fetch = FetchType.EAGER,optional = false)
    @JoinColumn(name = "idrole",referencedColumnName = "id")
    private Role role;
  /*  @OneToMany
    @JoinColumn(name = "id_role")
    private List<Role> role;*/


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        //return List.of(new SimpleGrantedAuthority(role.getNom_role()));
        return Collections.singleton(new SimpleGrantedAuthority(role.getNom_role()));
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
