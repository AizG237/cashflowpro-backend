package com.cashflowpro.cashflowpro.service;

import com.cashflowpro.cashflowpro.modele.VisaMastercard;

public interface VisaMastercardServiceImpl {
    VisaMastercard getCompte(long id_compte);

    //List<VisaMastercard> getAllUtilisateur();

    String deleteCompte(long id_compte);
    VisaMastercard addCompte(VisaMastercard visaMastercard);
    VisaMastercard updateCompte(long id_compte, VisaMastercard visaMastercard); // Pourquoi ça doit être "Long" au lieu de "long"??,
}
