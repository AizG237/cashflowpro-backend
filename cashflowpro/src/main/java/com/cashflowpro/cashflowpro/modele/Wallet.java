package com.cashflowpro.cashflowpro.modele;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Entity
@Table(name = "wallet")
@Data
@Component
public class Wallet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_Wallet;
    @Column
    private String Societe;
    @Column(length = 4)
    private String devise;

   /* private Paypal paypal;

    private Mtnmomo mtnmomo;

    private Orangemoney orangemoney;
    Wallet (Paypal paypal, Mtnmomo mtnmomo, Orangemoney orangemoney){
        this.mtnmomo = mtnmomo;
        this.orangemoney = orangemoney;
        this.paypal = paypal;
    }*/
    @ManyToOne @JoinColumn(name = "matricule")
    private Utilisateur utilisateur;
}
