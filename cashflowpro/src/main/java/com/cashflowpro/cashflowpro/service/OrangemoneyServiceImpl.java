package com.cashflowpro.cashflowpro.service;

import com.cashflowpro.cashflowpro.modele.Orangemoney;

import java.util.List;

public interface OrangemoneyServiceImpl {
    // create
    Orangemoney addOrangemoney(Orangemoney Orangemoney);
    //read
    Orangemoney getOrangemoney(long id);
    //read all
    List<Orangemoney> getAllOrangemoney();
    //update
    Orangemoney updateOrangemoney(long id, Orangemoney Orangemoney);
    //delete
    String deleteOrangemoney(long id);
}
