package com.cashflowpro.cashflowpro.service;

import com.cashflowpro.cashflowpro.modele.Facture;

import java.util.List;

public interface FactureServiceImpl {
    Facture getFacture(long id_facture);
    List<Facture> getAllFacture();
    String deleteFacture(long id_facture);
    Facture addFacture(Facture facture);
    Facture updateFacture(Long id_facture, Facture facture);

}
