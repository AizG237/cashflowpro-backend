package com.cashflowpro.cashflowpro.modele;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.stereotype.Component;

@Entity
@Table(name = "orange_money")
@Data
@Component
public class Orangemoney {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_money;
    @Column
    private String nomoperateur;
    @Column(length = 3)
    private int indicatifpays;
    @Column(length = 15)
    private long numero;
    @Column
    private String nomvalidation;
}