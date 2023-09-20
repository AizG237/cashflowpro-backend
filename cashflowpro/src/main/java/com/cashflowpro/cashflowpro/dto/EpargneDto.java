package com.cashflowpro.cashflowpro.dto;

import com.cashflowpro.cashflowpro.modele.Epargne;
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
public class EpargneDto {
    private long id_pe;
    private Date datesouscription;
    private int duree;
    private int montantmensuel;

    public EpargneDto fromEntity(Epargne epargne){
        if(epargne == null){
            return null;
        }
        EpargneDto epargneDto = new EpargneDto();
        epargneDto.setDatesouscription(epargne.getDatesouscription());
        epargneDto.setDuree(epargne.getDuree());
        epargneDto.setMontantmensuel(epargne.getMontantmensuel());
        return epargneDto;
    }
    public Epargne toEntity(EpargneDto epargneDto){
        if (epargneDto == null){
            return null;
        }
        Epargne epargne = new Epargne();
        epargne.setMontantmensuel(epargneDto.getMontantmensuel());
        epargne.setDuree(epargneDto.getDuree());
        epargne.setId_pe(epargneDto.getId_pe());
        epargne.setDatesouscription(epargneDto.getDatesouscription());
        return epargne;
    }
}
