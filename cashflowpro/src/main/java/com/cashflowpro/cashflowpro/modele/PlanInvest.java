package com.cashflowpro.cashflowpro.modele;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "planinvest")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlanInvest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id_planinvest;
    @Column
    private String nominvest;
    @Column
    private int duree;
    @Column
    private Date dateinit;
    @Column
    private String nomactif;
    @Column
    private int montantmin;

}