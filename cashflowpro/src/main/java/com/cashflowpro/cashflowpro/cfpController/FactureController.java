package com.cashflowpro.cashflowpro.cfpController;

import com.cashflowpro.cashflowpro.modele.Facture;
import com.cashflowpro.cashflowpro.service.FactureService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/facture")
@AllArgsConstructor
@Getter
@Setter
public class FactureController {
private final FactureService factureService;;
  //  @Autowired

    @GetMapping("/getAll")
    public List<Facture> getFacture(){
        //Facture Factures = new Facture("DOnfack","Pavel","Login","123", Facture.Role.Facture);
        return factureService.getAllFacture();
    }
    @GetMapping("/get/{id_Facture}")
    public Facture getFacture(@PathVariable long id_facture){
        return factureService.getFacture(id_facture);
    }
    @DeleteMapping("/delete/{id_Facture}")
    public void deleteFacture(@PathVariable String numero){
        factureService.deleteFacture(numero);
    }
    @PostMapping("/add/manuel")
    public Facture addFacture(@RequestBody Facture facture){
        facture.setType(Facture.Type.MANUELLE);
       facture.setEtat(Facture.Etat.NONPAYEE);
        return  factureService.addFacture(facture);
    }
    @PostMapping("/add/auto")
    public Facture addFactureauto(@RequestBody Facture facture){
        facture.setType(Facture.Type.AUTOMATIQUE);
        facture.setEtat(Facture.Etat.NONPAYEE);
        return  factureService.addFacture(facture);
    }
    @PutMapping("/update/{id_Facture}")
    public String updateFacture(@PathVariable long id_Facture, @RequestBody Facture facture){
        factureService.addFacture(facture);
        return "LE STRING LA DERANGE";
    }
    @PutMapping("/update/{id_FactureAuto}")
    public String updateFactureauto(@PathVariable long id_Facture, @RequestBody Facture facture){
        factureService.addFacture(facture);
        return "LE STRING LA DERANGE";
    }
}
