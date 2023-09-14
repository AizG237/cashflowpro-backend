package com.cashflowpro.cashflowpro.modele;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "addresse")
@Builder
public class Adresse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_adresse;
    @Column(length = 40)
    private String pays;
    @Column(length = 40)
    private String ville;
    @Column(length = 40)
    private String region; // EN CE QUI CONCERNE LE PAYS LE MIEUX ET DE CREER UNE TABLE "PAYS"
    @Column()
    private String pobox;
    @Column
    private String quartier;

    public Adresse(String pays, String ville, String region, String pobox, String quartier) {
        this.pays = pays;
        this.ville = ville;
        this.region = region;
        this.pobox = pobox;
        this.quartier = quartier;
    }
}
