package com.cashflowpro.cashflowpro.dto;

import com.cashflowpro.cashflowpro.modele.Adresse;
import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class AdresseDto {
    private long id_adresse;

    private String pays;

    private String ville;

    private String region; // EN CE QUI CONCERNE LE PAYS LE MIEUX ET DE CREER UNE TABLE "PAYS"

    private String pobox;

    private String quartier;

    public AdresseDto fromEntity(Adresse adresse) {
        if (adresse == null) {
            new RuntimeException("Erreur, adresse vide");
            return null;
        } else {
            return AdresseDto.builder()
                    .id_adresse(adresse.getId_adresse())
                    .pays(adresse.getPays())
                    .ville(adresse.getVille())
                    .pobox(adresse.getPobox())
                    .quartier(adresse.getQuartier())
                    .build();
        }

    }

    public Adresse toEntity(AdresseDto adresseDto) {
        if (adresseDto == null) {
            new RuntimeException("Erreur, reference adresse nulle");
            return null;
        } else {
            return Adresse.builder()
                    .ville(adresseDto.getVille())
                    .region(adresseDto.getRegion())
                    .pobox(adresseDto.getPobox())
                    .quartier(adresseDto.getQuartier())
                    .build();
        }


    }
}
