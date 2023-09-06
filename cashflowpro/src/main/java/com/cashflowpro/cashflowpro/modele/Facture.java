package com.cashflowpro.cashflowpro.modele;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name= "FACTURE")
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_facture;
    @Column
    private String nomsociete;
    @Column
    private int montant;
    @Column
    private Date date_reception;
    @Column
    private int delai;
    @Column
    private Etat etat;
    public enum Etat {
        PAYEE,
        NONPAYEE
    }
    @ManyToOne @JoinColumn(name = "matricule")
    private Utilisateur utilisateur;
}
