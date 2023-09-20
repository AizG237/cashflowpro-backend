package com.cashflowpro.cashflowpro.dto;

import com.cashflowpro.cashflowpro.modele.Facture;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FactureDto {
    private long id_facture;
    private String nomsociete;
    private int montant;
    private Date date_reception;
    private int delai;
    private Etat etat;
    private Facture.Type type;
    public enum Etat {
        PAYEE,
        NONPAYEE
    }
    public Facture toEntity(FactureDto factureDto){
        if (factureDto == null){
            return null;
        }
       Facture facture = new Facture();
        facture.setId_facture(factureDto.getId_facture());
        //facture.setEtat(FactureDto.);
        facture.setType(factureDto.getType());
        facture.setDelai(factureDto.getDelai());
        facture.setNomsociete(factureDto.getNomsociete());
        facture.setDate_reception(factureDto.getDate_reception());
        //facture.setUtilisateur(factureDto.);
        facture.setMontant(factureDto.getMontant());
        return facture;

    }

    public FactureDto fromEntity(Facture facture){
        if (facture == null){
            return null;
        }
        FactureDto factureDto = new FactureDto();
        factureDto.setId_facture(facture.getId_facture());
        //facture.setEtat(FactureDto.);
        factureDto.setType(facture.getType());
        factureDto.setDelai(facture.getDelai());
        factureDto.setNomsociete(facture.getNomsociete());
        factureDto.setDate_reception(facture.getDate_reception());
        //facture.setUtilisateur(factureDto.);
        factureDto.setMontant(facture.getMontant());
        return factureDto;

    }


}
