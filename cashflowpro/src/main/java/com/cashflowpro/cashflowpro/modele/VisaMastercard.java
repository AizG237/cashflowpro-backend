package com.cashflowpro.cashflowpro.modele;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "visamastercard")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class VisaMastercard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_visamastercard;

    @Column(length = 40)
    private Date date_creation;
    @Column
    private int numerocarte;
    @Column
    private int ccv;

}
