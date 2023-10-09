package com.cashflowpro.cashflowpro.modele;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name= "FACTURE")
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_facture;
    @Column
    private String numero;
    @Column
    private String nomsociete;
    @Column
    private int montant;
    @Column
    private Date date_reception;
    @Column
    private Date date_paiement;
    @Column
    private Date delai;
    @Column
    private Etat etat;
    @Column
    private Type type;
    public enum Etat {
        PAYEE,
        NONPAYEE
    }
    public enum Type{
        AUTOMATIQUE,
        MANUELLE
    }
    @ManyToOne @JoinColumn(name = "matricule")
    private Utilisateur utilisateur;
}
