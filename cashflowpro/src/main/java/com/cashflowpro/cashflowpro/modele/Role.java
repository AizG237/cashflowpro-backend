package com.cashflowpro.cashflowpro.modele;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "role")
@Data
public class Role {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_role;
    @Column
    private String nom;
    @Column
    private Date dateattrib;
}
