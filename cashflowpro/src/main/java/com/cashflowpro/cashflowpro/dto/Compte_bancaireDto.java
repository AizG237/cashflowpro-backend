package com.cashflowpro.cashflowpro.dto;

import com.cashflowpro.cashflowpro.modele.Compte_bancaire;
import com.cashflowpro.cashflowpro.modele.Utilisateur;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Compte_bancaireDto {
    private long id_compte;

    private String societe;

    private Date date_creation;

    private String pays; // EN CE QUI CONCERNE LE PAYS LE MIEUX ET DE CREER UNE TABLE "PAYS"

    private float solde;

    private int numero;

  private UtilisateurDto utilisateurDto;
  public Compte_bancaireDto fromEntity(Compte_bancaire compteBancaire){
      if(compteBancaire == null){
          return null;
      }
     Compte_bancaireDto compteBancaireDto = new Compte_bancaireDto();
      compteBancaireDto.setId_compte(compteBancaire.getId_compte());
      compteBancaireDto.setPays(compteBancaire.getPays());
     // compteBancaireDto.setUtilisateurDto(compteBancaire.getUtilisateur());
      compteBancaireDto.setDate_creation(compteBancaire.getDate_creation());
      compteBancaireDto.setSolde(compteBancaire.getSolde());
      compteBancaireDto.setSociete(compteBancaire.getSociete());
      compteBancaireDto.setNumero(compteBancaire.getNumero());
      return compteBancaireDto;
  }
  public Compte_bancaire toEntity(Compte_bancaireDto compteBancaireDto){
      if(compteBancaireDto == null){
          return null;
      }
      Compte_bancaire compteBancaire = new Compte_bancaire();
      compteBancaire.setId_compte(compteBancaireDto.getId_compte());
      compteBancaire.setNumero(compteBancaireDto.getNumero());
      //compteBancaire.setUtilisateur(compteBancaireDto.getUtilisateurDto());
      compteBancaire.setSociete(compteBancaireDto.getSociete());
      compteBancaire.setSolde(compteBancaireDto.getSolde());
      return compteBancaire;
  }
}
