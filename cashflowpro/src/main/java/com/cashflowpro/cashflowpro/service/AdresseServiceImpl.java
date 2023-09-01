package com.cashflowpro.cashflowpro.service;

import com.cashflowpro.cashflowpro.modele.Adresse;

import java.util.List;

public interface AdresseServiceImpl {
    Adresse getAdresse(long id_adresse);
    List<Adresse> getAllAdresse();
    String deleteAdresse(long id_adresse);
    Adresse addAdresse(Adresse adresse);
    Adresse updateAdresse(long matricule, Adresse adresse);

}
