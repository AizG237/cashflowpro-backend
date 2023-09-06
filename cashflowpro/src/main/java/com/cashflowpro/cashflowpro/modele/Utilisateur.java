package com.cashflowpro.cashflowpro.modele;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "utilisateur")
@AllArgsConstructor
@Data

public class Utilisateur {

    public Utilisateur(){

    }

    public enum Role{
        EMPLOYE,
        CLIENT,
        DIRECTEUR
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long matricule;
    @Column(length = 40)
    protected String nom;
    @Column(length = 40)
    protected String prenom;
    @Column(length = 40)
    protected String login;
    @Column(length = 40)
    protected String pwd;
    @Column
    private Role role;
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

}
