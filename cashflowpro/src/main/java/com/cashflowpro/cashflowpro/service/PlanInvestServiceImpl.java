package com.cashflowpro.cashflowpro.service;

import com.cashflowpro.cashflowpro.modele.PlanInvest;

import java.util.List;

public interface PlanInvestServiceImpl {
    //create
    PlanInvest addPlaninvest(PlanInvest planInvest);
    //Read
    PlanInvest getPlaninvest(long id);
    //Readall
    List<PlanInvest> getAllPlaninvest();
    //update
    PlanInvest updatePlaninvest(long id, PlanInvest planInvest);
    //delete
    String deletePlaninvest(long id);

}
