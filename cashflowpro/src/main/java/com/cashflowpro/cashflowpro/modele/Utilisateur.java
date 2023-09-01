package com.cashflowpro.cashflowpro.modele;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "UTILISATEUR")
@AllArgsConstructor
@Setter
@Getter

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
    private String nom;
    @Column(length = 40)
    private String prenom;
    @Column(length = 40)
    private String login;
    @Column(length = 40)
    private String pwd;
    @Column(length = 40)
    private Role role;
    @Column
    private float compte;
    @Column
    private Date datenaiss;
    @Column
    private long telephone;


}
