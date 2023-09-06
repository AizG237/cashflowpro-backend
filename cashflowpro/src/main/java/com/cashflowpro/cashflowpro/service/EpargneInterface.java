package com.cashflowpro.cashflowpro.service;

import com.cashflowpro.cashflowpro.modele.Epargne;

import java.util.List;

public interface EpargneInterface {
    // create
    Epargne addEpargne(Epargne epargne);
    //read
    Epargne getEpargne(long id);
    //read all
    List<Epargne> getAllEpargne();
    //update
    Epargne updateEpargne(long id, Epargne epargne);
    //delete
    String deleteEpargne(long id);
    //delete all

}
