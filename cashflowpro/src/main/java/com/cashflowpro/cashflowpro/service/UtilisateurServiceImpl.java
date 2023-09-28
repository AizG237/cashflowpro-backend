package com.cashflowpro.cashflowpro.service;

import com.cashflowpro.cashflowpro.modele.Utilisateur;

import java.util.List;

public interface UtilisateurServiceImpl {
    Utilisateur getUtilisateur(String matricule);
    List<Utilisateur> getAllUtilisateur();
    String deleteUtilisateur(long matricule);
    Utilisateur addUtilisateur(Utilisateur utilisateur);
    Utilisateur updateUtilisateur(String matricule, Utilisateur utilisateur);

}
