package com.cashflowpro.cashflowpro.service;

import com.cashflowpro.cashflowpro.modele.Virementsalaire;

import java.util.List;

public interface VirementsalaireInterface {
    // create
    Virementsalaire addVirement(Virementsalaire virementsalaire);
    //read
    Virementsalaire getVirement(long id);
    //read all
    List<Virementsalaire> getAllVirement();
    //update
    Virementsalaire updateVirement(long id, Virementsalaire virementsalaire);
    //delete
    String deleteVirement(long id);
}
