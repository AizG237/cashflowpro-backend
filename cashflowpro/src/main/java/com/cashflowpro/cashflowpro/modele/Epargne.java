package com.cashflowpro.cashflowpro.modele;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "planepargne")
@Data
public class Epargne {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_pe;
    @Column
    private Date datesouscription;
    @Column
    private int duree;
    @Column
    private int montantmensuel;
}
