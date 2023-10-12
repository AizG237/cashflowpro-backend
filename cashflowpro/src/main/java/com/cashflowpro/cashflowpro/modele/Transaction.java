package com.cashflowpro.cashflowpro.modele;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="TRANSACTION")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long  id_transact;
    @Column()
    private Date date_init;
    @Column
    private Date date_effect;
    @Column
    private String motif;
    @Column
    private long destinateur;
    @Column
    private long destinataire;
    @Column
    private float montant;
    @Column
    private boolean type_cashflow;

    public Transaction(String motif, long destinataire, float montant) {
        this.motif = motif;
        this.destinataire = destinataire;
        this.montant = montant;
    }
}
