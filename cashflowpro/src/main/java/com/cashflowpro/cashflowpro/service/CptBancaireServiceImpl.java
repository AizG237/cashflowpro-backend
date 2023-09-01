package com.cashflowpro.cashflowpro.service;

import com.cashflowpro.cashflowpro.modele.Compte_bancaire;
import com.cashflowpro.cashflowpro.modele.Utilisateur;

import java.util.List;

public interface CptBancaireServiceImpl {
    Compte_bancaire getCompte(long id_compte);

    //List<Compte_bancaire> getAllUtilisateur();

    String deleteCompte(long id_compte);
    Compte_bancaire addCompte(Compte_bancaire compteBancaire);
    Compte_bancaire updateCompte(long id_compte, Compte_bancaire compteBancaire); // Pourquoi ça doit être "Long" au lieu de "long"??,
}
