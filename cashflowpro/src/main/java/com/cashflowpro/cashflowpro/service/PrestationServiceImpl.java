package com.cashflowpro.cashflowpro.service;

import com.cashflowpro.cashflowpro.modele.Prestation;

import java.util.List;

public interface PrestationServiceImpl {
    //Create
    Prestation addPrestation(Prestation prestation);
    //Read
    Prestation getPrestation(long id);
    //ReadAll
    List<Prestation> getAllPrestation();
    //Update
    Prestation updatePrestation(Long id,Prestation prestation);
    //Delete
    String deletePrestation(long id);
}
