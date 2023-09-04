package com.cashflowpro.cashflowpro.service;

import com.cashflowpro.cashflowpro.modele.Mtnmomo;

import java.util.List;

public interface MtnMomoServiceImpl {
    // create
    Mtnmomo addMtnmomo(Mtnmomo mtnmomo);
    //read
    Mtnmomo getMtnmomo(long id);
    //read all
    List<Mtnmomo> getAllMtnmomo();
    //update
    Mtnmomo updateMtnmomo(long id, Mtnmomo mtnmomo);
    //delete
    String deleteMtnmomo(long id);
}
