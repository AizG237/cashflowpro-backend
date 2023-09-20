package com.cashflowpro.cashflowpro.dto;


import com.cashflowpro.cashflowpro.modele.Virementsalaire;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@NoArgsConstructor
@Data
public class VirementsalaireDto {
    private long id_virementsalaire;
    private String motif;
    private String mois;
    private int annee;
    private Date datevirement;

    public VirementsalaireDto fromEntity(Virementsalaire virementsalaire){
        if (virementsalaire == null){
            return null;
        }
        VirementsalaireDto virementsalaireDto = new VirementsalaireDto();
        virementsalaireDto.setId_virementsalaire(virementsalaire.getId_virementsalaire());
        virementsalaireDto.setMotif(virementsalaire.getMotif());
        virementsalaireDto.setMotif(virementsalaire.getMotif());
        virementsalaireDto.setAnnee(virementsalaire.getAnnee());
        virementsalaireDto.setDatevirement(virementsalaire.getDatevirement());
        return virementsalaireDto;
    }

    public Virementsalaire toEntity(VirementsalaireDto virementsalaireDto){
        if (virementsalaireDto == null){
            return null;
        }
        Virementsalaire virementsalaire = new Virementsalaire();
        virementsalaire.setId_virementsalaire(virementsalaireDto.getId_virementsalaire());
        virementsalaire.setMotif(virementsalaireDto.getMotif());
        virementsalaire.setMotif(virementsalaireDto.getMotif());
        virementsalaire.setAnnee(virementsalaireDto.getAnnee());
        virementsalaire.setDatevirement(virementsalaireDto.getDatevirement());
        return virementsalaire;
    }


}
