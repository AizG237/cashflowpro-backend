package com.cashflowpro.cashflowpro.dto;

import com.cashflowpro.cashflowpro.modele.Orangemoney;
import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class OrangemoneyDto {
    private long id_money;

    private String nomoperateur;

    private int indicatifpays;

    private long numero;

    private String nomvalidation;

    public Orangemoney toEntity(OrangemoneyDto OrangemoneyDto){
        if (OrangemoneyDto == null){
            return null;
        }
        Orangemoney Orangemoney = new Orangemoney();
        Orangemoney.setNomvalidation(OrangemoneyDto.getNomvalidation());
        Orangemoney.setIndicatifpays(OrangemoneyDto.getIndicatifpays());
        Orangemoney.setNumero(OrangemoneyDto.getNumero());
        Orangemoney.setNomvalidation(OrangemoneyDto.getNomvalidation());
        return Orangemoney;
    }
    public OrangemoneyDto fromEntity(Orangemoney Orangemoney){
        if (Orangemoney == null){
            return  null;
        }
        OrangemoneyDto OrangemoneyDto = new OrangemoneyDto();
        OrangemoneyDto.setIndicatifpays(Orangemoney.getIndicatifpays());
        OrangemoneyDto.setNumero(Orangemoney.getNumero());
        OrangemoneyDto.setIndicatifpays(Orangemoney.getIndicatifpays());
        OrangemoneyDto.setNomvalidation(Orangemoney.getNomvalidation());
        OrangemoneyDto.setNomoperateur(Orangemoney.getNomoperateur());
        return OrangemoneyDto;
    }
}
