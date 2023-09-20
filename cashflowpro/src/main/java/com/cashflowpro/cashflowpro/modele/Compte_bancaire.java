package com.cashflowpro.cashflowpro.modele;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "COMPTEBANCAIRE")
@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
public class Compte_bancaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_compte;
    @Column(length = 40)
    private String societe;
    @Column(length = 40)
    private Date date_creation;
    @Column(length = 40)
    private String pays; // EN CE QUI CONCERNE LE PAYS LE MIEUX ET DE CREER UNE TABLE "PAYS"
    @Column()
    private float solde;
    @Column
    private int numero;
    @ManyToOne @JoinColumn(name = "matricule")
    private Utilisateur utilisateur;
}
