package com.cashflowpro.cashflowpro.cfpController.service;

import com.cashflowpro.cashflowpro.modele.Employe;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class cfpService {
    static  private ArrayList<Employe> employes = new ArrayList<>(Arrays.asList(
            new Employe(1,"Donfack","Pavel","Login","123", Employe.Role.EMPLOYE),
            new Employe(2,"Nwal","Frydas","Login","741", Employe.Role.EMPLOYE),
            new Employe(3,"Tebah","Martin","Login","789", Employe.Role.EMPLOYE),
            new Employe(4,"Esso","juvenal","Login","456", Employe.Role.DIRECTEUR)
    ));

    public static Employe getEmploye(long matricule) {
        return employes.stream().filter(employe -> employe.getMatricule()==matricule).findFirst().orElseThrow(null);
    }

    public static void deleteEmploye(long matricule) {
        employes.removeIf(employe -> employe.getMatricule() == matricule);
    }

    public static void addEmploye(Employe employe) {
        employes.add(employe);
    }

    public static void updateEmploye(Employe employe, long matricule) {
        employes.forEach(employe1 -> {
            if(employe1.getMatricule() == matricule){
                employes.set(employes.indexOf(employe1),employe);
            }
        });
    }

    public List<Employe> getEmployes(){
    return employes;
    }
}
