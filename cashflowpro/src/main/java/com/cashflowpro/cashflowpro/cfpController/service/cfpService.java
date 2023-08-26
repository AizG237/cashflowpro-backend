package com.cashflowpro.cashflowpro.cfpController.service;

import com.cashflowpro.cashflowpro.modele.Utilisateur;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class cfpService {
    static  private ArrayList<Utilisateur> utilisateurs = new ArrayList<>(Arrays.asList(
            new Utilisateur(1,"Donfack","Pavel","Login","123", Utilisateur.Role.EMPLOYE),
            new Utilisateur(2,"Nwal","Frydas","Login","741", Utilisateur.Role.EMPLOYE),
            new Utilisateur(3,"Tebah","Martin","Login","789", Utilisateur.Role.EMPLOYE),
            new Utilisateur(4,"Esso","juvenal","Login","456", Utilisateur.Role.DIRECTEUR)
    ));

    public static Utilisateur getEmploye(long matricule) {
        return utilisateurs.stream().filter(utilisateur -> utilisateur.getMatricule()==matricule).findFirst().orElseThrow(null);
    }

    public static void deleteEmploye(long matricule) {
        utilisateurs.removeIf(utilisateur -> utilisateur.getMatricule() == matricule);
    }

    public static void addEmploye(Utilisateur utilisateur) {
        utilisateurs.add(utilisateur);
    }

    public static void updateEmploye(Utilisateur utilisateur, long matricule) {
        utilisateurs.forEach(utilisateur1 -> {
            if(utilisateur1.getMatricule() == matricule){
                utilisateurs.set(utilisateurs.indexOf(utilisateur1), utilisateur);
            }
        });
    }

    public List<Utilisateur> getEmployes(){
    return utilisateurs;
    }
}
