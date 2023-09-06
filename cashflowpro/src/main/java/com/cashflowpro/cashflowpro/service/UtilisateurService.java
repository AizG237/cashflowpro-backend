package com.cashflowpro.cashflowpro.service;

import com.cashflowpro.cashflowpro.modele.Utilisateur;
import com.cashflowpro.cashflowpro.repository.UtilisateurRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UtilisateurService implements UtilisateurServiceImpl {
    private final UtilisateurRepository utilisateurRepository;
    @Override
    public Utilisateur getUtilisateur(long matricule) {
        //JE SOUHAITE RETOURNE UN UTILISATEUR GRACE AU MATRICULE
        return utilisateurRepository.findById(matricule).orElseThrow(() -> new RuntimeException("UTILISATEUR NON EXISTANT DANS NOTRE SYSTEME"));
    }

    @Override
    public List<Utilisateur> getAllUtilisateur() {

        return utilisateurRepository.findAll();
    }

    @Override
    public String deleteUtilisateur(long matricule) {
        utilisateurRepository.deleteById(matricule);
        return "Supprimé;";

    }

    @Override
    public Utilisateur addUtilisateur(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

    @Override
    public Utilisateur updateUtilisateur(long matricule, Utilisateur utilisateur) {
        return utilisateurRepository.findById(matricule)
                .map(u-> {
                    u.setLogin(utilisateur.getLogin());
                    u.setNom(utilisateur.getNom());
                    u.setPwd(utilisateur.getPwd());
                    u.setPrenom(utilisateur.getPrenom());
                    //u.setRole(utilisateur.getRole());
                    u.setCompte(utilisateur.getCompte());
                    u.setDatenaiss(utilisateur.getDatenaiss());
                    u.setTelephone(utilisateur.getTelephone());
                    return utilisateurRepository.save(u);
                }).orElseThrow(() -> new RuntimeException("Utilisateur inexistant dans le système"));
    }
   /* static  private ArrayList<Utilisateur> utilisateurs = new ArrayList<>(Arrays.asList(
            new Utilisateur(1,"Donfack","Pavel","Login","123", Utilisateur.Role.EMPLOYE),
            new Utilisateur(2,"Nwal","Frydas","Login","741", Utilisateur.Role.EMPLOYE),
            new Utilisateur(3,"Tebah","Martin","Login","789", Utilisateur.Role.EMPLOYE),
            new Utilisateur(4,"Esso","juvenal","Login","456", Utilisateur.Role.DIRECTEUR)
    ));

    public static Utilisateur getUtilisateur(long matricule) {
        return utilisateurs.stream().filter(utilisateur -> utilisateur.getMatricule()==matricule).findFirst().orElseThrow(null);
    }

    public static void deleteUtilisateur(long matricule) {
        utilisateurs.removeIf(utilisateur -> utilisateur.getMatricule() == matricule);
    }

    public static void addUtilisateur(Utilisateur utilisateur) {
        utilisateurs.add(utilisateur);
    }

    public static void updateUtilisateur(Utilisateur utilisateur, long matricule) {
        utilisateurs.forEach(utilisateur1 -> {
            if(utilisateur1.getMatricule() == matricule){
                utilisateurs.set(utilisateurs.indexOf(utilisateur1), utilisateur);
            }
        });
    }

    public List<Utilisateur> getUtilisateurs(){
    return utilisateurs;
    }*/
}
