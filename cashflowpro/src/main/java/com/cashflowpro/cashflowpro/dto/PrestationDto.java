package com.cashflowpro.cashflowpro.dto;

import com.cashflowpro.cashflowpro.modele.Utilisateur;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class PrestationDto {
    private long  id_prestation;

    private String libelle;

    private String Domaine;

    private int duree;

    private String nom_projet;

    private int montant_total;

    private int montant_paye;

    private UtilisateurDto utilisateurDto;
}
