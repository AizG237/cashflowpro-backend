package com.cashflowpro.cashflowpro.modele;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "BROKER")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Broker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_broker;
    @Column(length = 40)
    private String nom;
    @Column(length = 40)
    private String situation;
    @Column(length = 40)
    private String autoriteregulation;
    @Column(length = 40)
    private String couverturefiscale;
    @Column
    private Date datecreation;
    @Column
    private Date dateouverturecpt;

}
