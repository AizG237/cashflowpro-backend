package com.cashflowpro.cashflowpro.dto;

import com.cashflowpro.cashflowpro.modele.Prestation;
import com.cashflowpro.cashflowpro.modele.Utilisateur;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class PrestationDto {
    private long  id_prestation;
    private String libelle;
    private String Domaine;
    private int duree;
    private String nom_projet;
    private int montant_total;
    private int montant_paye;
    private UtilisateurDto utilisateurDto;

    public PrestationDto fromEntity(Prestation prestation){
        if (prestation == null){
            return null;
        }
        PrestationDto prestationDto =new PrestationDto();
        prestationDto.setId_prestation(prestation.getId_prestation());
        prestationDto.setLibelle(prestation.getLibelle());
        prestationDto.setDomaine(prestation.getDomaine());
        prestationDto.setDuree(prestation.getDuree());
        prestationDto.setNom_projet(prestation.getNom_projet());
        prestationDto.setMontant_paye(prestation.getMontant_paye());
        prestationDto.setMontant_paye(prestation.getMontant_paye());
       // prestationDto.setUtilisateurDto(prestation.getUtilisateur());
        return prestationDto;
    }

    public Prestation toEntity(PrestationDto prestationDto){
        if (prestationDto == null){
            return null;
        }
        Prestation prestation =new Prestation();
        prestation.setId_prestation(prestationDto.getId_prestation());
        prestation.setLibelle(prestationDto.getLibelle());
        prestation.setDomaine(prestationDto.getDomaine());
        prestation.setDuree(prestationDto.getDuree());
        prestation.setNom_projet(prestationDto.getNom_projet());
        prestation.setMontant_paye(prestationDto.getMontant_paye());
        prestation.setMontant_paye(prestationDto.getMontant_paye());
        // prestationDto.setUtilisateurDto(prestation.getUtilisateur());
        return prestation;
    }
}
