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

    //plan d'investissement
    private long id_planinvest;
    private String nominvest;
    private int dureemin;
    private Date dateinit;
    private String nomactif;
    private int montantmin;
    private float rendementmoyen;

    //Broker

    private String nomBroker;
    private String situationBroker;
    private String autoriteregulationBroker;
    private String couverturefiscaleBroker;
    private Date datecreationBroker;
    private Date dateouverturecptBroker;


    //Utilisateur qui initialise


    public PlanInvestDto fromEntity(PlanInvest planInvest, Broker broker){
        if (planInvest == null){
            return null;
        }
        // PLAN INVESTISSEMENT
        PlanInvestDto planInvestDto = new PlanInvestDto();
        planInvestDto.setId_planinvest(planInvest.getId_planinvest());
        planInvestDto.setNomactif(planInvest.getNomactif());
        planInvestDto.setNominvest(planInvest.getNominvest());
        planInvestDto.setDateinit(planInvest.getDateinit());
        planInvestDto.setDureemin(planInvest.getDureemin());
        planInvestDto.setRendementmoyen(planInvest.getRendementmoyen());

        //BROKER
        planInvestDto.setNomBroker(broker.getNom());
        planInvestDto.setSituationBroker(broker.getSituation());
        planInvestDto.setAutoriteregulationBroker(broker.getAutoriteregulation());
        planInvestDto.setCouverturefiscaleBroker(broker.getCouverturefiscale());
        planInvestDto.setDatecreationBroker(broker.getDatecreation());
        planInvestDto.setDateouverturecptBroker(broker.getDateouverturecpt());


        return planInvestDto;
    }

    public PlanInvest toEntityPlanInvest(PlanInvestDto planInvestDto){
        if (planInvestDto == null){
            return null;
        }else{
        PlanInvest planInvest = new PlanInvest();
        planInvest.setId_planinvest(planInvestDto.getId_planinvest());
        planInvest.setNomactif(planInvestDto.getNomactif());
        planInvest.setNominvest(planInvestDto.getNominvest());
        planInvest.setDateinit(planInvestDto.getDateinit());
        planInvest.setDureemin(planInvestDto.getDureemin());
        planInvest.setRendementmoyen(planInvestDto.getRendementmoyen());
        // planInvestDto.setUtilisateurDto(planInvest.getUtilisateur());
        return planInvest;}
    }

    public Broker toEntityBroker(PlanInvestDto planInvestDto){
        if (planInvestDto == null){
            return null;
        }else{
            Broker broker = new Broker();
            broker.setNom(planInvestDto.getNomBroker());
            broker.setDateouverturecpt(planInvestDto.getDateouverturecptBroker());
            broker.setCouverturefiscale(planInvestDto.getCouverturefiscaleBroker());
            broker.setSituation(planInvestDto.getSituationBroker());
            broker.setAutoriteregulation(planInvestDto.getAutoriteregulationBroker());
            broker.setDatecreation(planInvestDto.getDatecreationBroker());
            return broker;
        }

    }


    //private List<UtilisateurDto> utilisateursDtos;
}
