package com.cashflowpro.cashflowpro.dto;

import com.cashflowpro.cashflowpro.modele.Broker;
import com.cashflowpro.cashflowpro.modele.PlanInvest;
import com.cashflowpro.cashflowpro.modele.Utilisateur;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@NoArgsConstructor
@Data
public class PlanInvestDto {
    private long id_planinvest;
    private String nominvest;
    private int dureemin;
    private Date dateinit;
    private String nomactif;
    private int montantmin;
    private Broker broker;
    private UtilisateurDto utilisateurDto;

    public PlanInvestDto fromEntity(PlanInvest planInvest){
        if (planInvest == null){
            return null;
        }
        PlanInvestDto planInvestDto = new PlanInvestDto();
        planInvestDto.setId_planinvest(planInvest.getId_planinvest());
        planInvestDto.setNomactif(planInvest.getNomactif());
        planInvestDto.setNominvest(planInvest.getNominvest());
        planInvestDto.setDateinit(planInvest.getDateinit());
        planInvestDto.setDureemin(planInvest.getDureemin());
        planInvestDto.setBroker(planInvest.getBroker());
       // planInvestDto.setUtilisateurDto(planInvest.getUtilisateur());
        return planInvestDto;
    }

    public PlanInvest toEntity(PlanInvestDto planInvestDto){
        if (planInvestDto == null){
            return null;
        }
        PlanInvest planInvest = new PlanInvest();
        planInvest.setId_planinvest(planInvestDto.getId_planinvest());
        planInvest.setNomactif(planInvestDto.getNomactif());
        planInvest.setNominvest(planInvestDto.getNominvest());
        planInvest.setDateinit(planInvestDto.getDateinit());
        planInvest.setDureemin(planInvestDto.getDureemin());
        planInvest.setBroker(planInvestDto.getBroker());
        // planInvestDto.setUtilisateurDto(planInvest.getUtilisateur());
        return planInvest;
    }


    //private List<UtilisateurDto> utilisateursDtos;
}
