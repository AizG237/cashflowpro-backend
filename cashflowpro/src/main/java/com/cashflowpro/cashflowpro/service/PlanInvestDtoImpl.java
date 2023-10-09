package com.cashflowpro.cashflowpro.service;

import com.cashflowpro.cashflowpro.dto.PlanInvestDto;
import com.cashflowpro.cashflowpro.modele.Broker;
import com.cashflowpro.cashflowpro.modele.PlanInvest;

import java.util.List;

public interface PlanInvestDtoImpl {
    // create
    String addPlan( PlanInvestDto planInvestDto);

    //Read
    PlanInvestDto readPlan(String nomPlan, String nomBroker); // ICI ON VA CHERCHER EN FONCTION DU NOM

    //Read all
//    List<PlanInvestDto> readAll();

    // update
    PlanInvestDto updatePlan(String nomPlan, String nomBroker, PlanInvest planInvest, Broker broker);// il nous faut l'ID ici

    //delete
    String deletePlan(String nomPlan, String nomBroker); // ID ICI AUSSI.

}
