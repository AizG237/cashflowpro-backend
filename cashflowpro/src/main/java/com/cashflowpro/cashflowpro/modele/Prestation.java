package com.cashflowpro.cashflowpro.modele;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CollectionId;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="PRESTATION")
public class Prestation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long  id_prestation;
    @Column()
    private String libelle;
    @Column
    private String Domaine;
    @Column
    private int duree;
    @Column
    private String nom_projet;
    @Column
    private int montant_total;
    @Column
    private int montant_paye;
}
