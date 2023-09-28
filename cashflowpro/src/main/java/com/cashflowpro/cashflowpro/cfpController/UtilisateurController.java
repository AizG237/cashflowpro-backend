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
@CrossOrigin(origins = "*")
@AllArgsConstructor
public class UtilisateurController {
private final UtilisateurServiceImpl utilisateurService;
@GetMapping("/get/all")
    public List<Utilisateur> getAllUtilisateur(){
    return utilisateurService.getAllUtilisateur();
}
@PutMapping("/update/{id}")
    public Utilisateur updateUtilisateur(@PathVariable String matricule, @RequestBody Utilisateur utilisateur){
    return utilisateurService.updateUtilisateur(matricule,utilisateur);
}
@DeleteMapping("/delete/{id}")
    public String deleteUtilisateur(@PathVariable long matricule){
    return utilisateurService.deleteUtilisateur(matricule);
}
@GetMapping("/get/{id}")
    public Utilisateur getUtilisateur(@PathVariable String matricule){
    return utilisateurService.getUtilisateur(matricule);
}
@PostMapping("/add")
    public Utilisateur addUtilisateur(@RequestBody Utilisateur utilisateur){
    return utilisateurService.addUtilisateur(utilisateur);
}
}
