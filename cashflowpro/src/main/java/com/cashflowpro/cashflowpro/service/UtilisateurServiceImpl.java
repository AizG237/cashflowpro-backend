package com.cashflowpro.cashflowpro.service;

import com.cashflowpro.cashflowpro.modele.Utilisateur;

import java.util.List;

public interface UtilisateurServiceImpl {
    Utilisateur getUtilisateur(long matricule);
    List<Utilisateur> getAllUtilisateur();
    String deleteUtilisateur(long matricule);
    Utilisateur addUtilisateur(Utilisateur utilisateur);
    Utilisateur updateUtilisateur(long matricule, Utilisateur utilisateur);

}
