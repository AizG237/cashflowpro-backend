package com.cashflowpro.cashflowpro.dto;

import com.cashflowpro.cashflowpro.modele.Utilisateur;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class WalletDto {
    private long id_Wallet;

    private String Societe;

    private String devise;

    private UtilisateurDto utilisateurDto;
}
