package com.cashflowpro.cashflowpro.cfpController;

import com.cashflowpro.cashflowpro.service.UtilisateurServiceImpl;
import com.cashflowpro.cashflowpro.service.UtilisateurService;
import com.cashflowpro.cashflowpro.modele.Utilisateur;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/utilisateur")
@AllArgsConstructor
@Getter
@Setter
public class UtilisateurController {
    private final UtilisateurServiceImpl utilisateurServiceImpl;
   // @Autowired
  //  private UtilisateurService cfpservice;
    @GetMapping("/Utilisateur/getAll")
   public List<Utilisateur> getUtilisateur(){
   //Utilisateur Utilisateurs = new Utilisateur("DOnfack","Pavel","Login","123", Utilisateur.Role.Utilisateur);
    return utilisateurServiceImpl.getAllUtilisateur();
   }
   @GetMapping("/Utilisateur/get/{matricule}")
    public Utilisateur getUtilisateur(@PathVariable long matricule){
        return utilisateurServiceImpl.getUtilisateur(matricule);
    }
    @DeleteMapping("/Utilisateur/delete/{matricule}")
    public void deleteUtilisateur(@PathVariable long matricule){
        utilisateurServiceImpl.deleteUtilisateur(matricule);
    }
    @PostMapping("/Utilisateur/add")
    public Utilisateur addUtilisateur(@RequestBody Utilisateur utilisateur){
        return  utilisateurServiceImpl.addUtilisateur(utilisateur);
    }
    @PutMapping("/Utilisateur/update/{matricule}")
    public String updateUtilisateur(@PathVariable long matricule, @RequestBody Utilisateur utilisateur){
              utilisateurServiceImpl.addUtilisateur(utilisateur);
              return "LE STRING LA DERANGE";
    }
}
