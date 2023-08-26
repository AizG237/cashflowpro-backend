package com.cashflowpro.cashflowpro.modele;

import jakarta.persistence.*;

@Entity
@Table(name = "UTILISATEUR")
public class Utilisateur {
    public Utilisateur(long matricule, String nom, String prenom, String login, String pwd, Role role) {
        super();
        this.nom = nom;
        this.prenom = prenom;
        this.login = login;
        this.pwd = pwd;
         this.role=role;
         this.matricule = matricule;
    }
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

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public long getMatricule() {
        return matricule;
    }

    public void setMatricule(long matricule) {
        this.matricule = matricule;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
