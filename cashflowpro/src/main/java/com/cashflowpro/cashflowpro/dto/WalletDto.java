package com.cashflowpro.cashflowpro.dto;

import com.cashflowpro.cashflowpro.modele.Utilisateur;
import com.cashflowpro.cashflowpro.modele.Wallet;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class WalletDto {
    private long id_Wallet;
    private String Societe;
    private String devise;
    private UtilisateurDto utilisateurDto;

    public WalletDto fromEntity(Wallet wallet){
        if (wallet == null){
            return null;
        }
        WalletDto walletDto =new WalletDto();
        walletDto.setId_Wallet(wallet.getId_Wallet());
        walletDto.setSociete(wallet.getSociete());
        walletDto.setDevise(wallet.getDevise());
       // walletDto.setUtilisateurDto(wallet.getUtilisateur());
        return walletDto;
    }
    public Wallet fromEntity(WalletDto walletDto){
        if (walletDto == null){
            return null;
        }
        Wallet wallet =new Wallet();
        wallet.setId_Wallet(walletDto.getId_Wallet());
        wallet.setSociete(walletDto.getSociete());
        wallet.setDevise(walletDto.getDevise());
        // walletDto.setUtilisateurDto(wallet.getUtilisateur());
        return wallet;
    }
}
