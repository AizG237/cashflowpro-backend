package com.cashflowpro.cashflowpro.cfpController;
import com.cashflowpro.cashflowpro.modele.Compte_bancaire;
import com.cashflowpro.cashflowpro.modele.Utilisateur;
import com.cashflowpro.cashflowpro.service.CptBancaireService;
import com.cashflowpro.cashflowpro.service.UtilisateurServiceImpl;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cptbancaire")
@AllArgsConstructor
@Getter
@Setter

public class CptBancaireController {
    private final CptBancaireService cptBancaireService;
    //@Autowired
    @GetMapping("/get/{id_compte}")
    public Compte_bancaire getCompte(@PathVariable long id_compte){
        return cptBancaireService.getCompte(id_compte);
    }
    @DeleteMapping("/delete/{id_compte}")
    public void deleteCompte(@PathVariable long id_compte){
        cptBancaireService.deleteCompte(id_compte);
    }
    @PostMapping("/add")
    public Compte_bancaire addCompete(@RequestBody Compte_bancaire compteBancaire){
        return  cptBancaireService.addCompte(compteBancaire);
    }
    @PutMapping("update/{id_compte}")
    public String updateCompte(@PathVariable long id_compte, @RequestBody Compte_bancaire compteBancaire){
        cptBancaireService.updateCompte(id_compte, compteBancaire);
        return "LE STRING LA DERANGE";
    }
}
