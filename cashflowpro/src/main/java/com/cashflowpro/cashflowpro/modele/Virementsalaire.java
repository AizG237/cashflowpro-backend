package com.cashflowpro.cashflowpro.modele;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "virement_salaire")
public class Virementsalaire {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_virementsalaire;
    @Column
    private String motif;
    @Column
    private String mois;
    @Column
    private int annee;
    @Column
    private Date datevirement;
}
