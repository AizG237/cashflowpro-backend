package com.cashflowpro.cashflowpro.dto;

import com.cashflowpro.cashflowpro.modele.Mtnmomo;
import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class MtnmomoDto {
    private long id_momo;
    private String nomoperateur;
    private int indicatifpays;
    private long numero;
    private String nomvalidation;

    public Mtnmomo toEntity(MtnmomoDto mtnmomoDto){
        if (mtnmomoDto == null){
           return null;
        }
        Mtnmomo mtnmomo = new Mtnmomo();
        mtnmomo.setNomvalidation(mtnmomoDto.getNomvalidation());
        mtnmomo.setIndicatifpays(mtnmomoDto.getIndicatifpays());
        mtnmomo.setNumero(mtnmomoDto.getNumero());
        mtnmomo.setNomvalidation(mtnmomoDto.getNomvalidation());
        return mtnmomo;
    }
    public MtnmomoDto fromEntity(Mtnmomo mtnmomo){
        if (mtnmomo == null){
            return  null;
        }
        MtnmomoDto mtnmomoDto = new MtnmomoDto();
        mtnmomoDto.setIndicatifpays(mtnmomo.getIndicatifpays());
        mtnmomoDto.setNumero(mtnmomo.getNumero());
        mtnmomoDto.setIndicatifpays(mtnmomo.getIndicatifpays());
        mtnmomoDto.setNomvalidation(mtnmomo.getNomvalidation());
        mtnmomoDto.setNomoperateur(mtnmomo.getNomoperateur());
        return mtnmomoDto;
    }
}
