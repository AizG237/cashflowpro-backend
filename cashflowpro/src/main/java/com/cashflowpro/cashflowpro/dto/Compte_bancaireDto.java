package com.cashflowpro.cashflowpro.dto;

import com.cashflowpro.cashflowpro.modele.Utilisateur;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Builder
@Data
public class Compte_bancaireDto {
    private long id_compte;

    private String societe;

    private Date date_creation;

    private String pays; // EN CE QUI CONCERNE LE PAYS LE MIEUX ET DE CREER UNE TABLE "PAYS"

    private float solde;

    private int numero;


    private UtilisateurDto utilisateurDto;
}
