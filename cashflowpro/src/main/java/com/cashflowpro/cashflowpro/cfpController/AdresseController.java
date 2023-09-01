
package com.cashflowpro.cashflowpro.cfpController;

import com.cashflowpro.cashflowpro.modele.Adresse;
import com.cashflowpro.cashflowpro.modele.Utilisateur;
import com.cashflowpro.cashflowpro.service.AdresseService;
import com.cashflowpro.cashflowpro.service.AdresseServiceImpl;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/adresse")
@AllArgsConstructor

public class AdresseController {
    private final AdresseServiceImpl adresseService;
    //@Autowired

    @GetMapping("/getAll")
    public List<Adresse> getAdresse(){
        //Adresse Adresses = new Adresse("DOnfack","Pavel","Login","123", Adresse.Role.Adresse);
        return adresseService.getAllAdresse();
    }
    @GetMapping("/Adresse/get/{id_adresse}")
    public Adresse getAdresse(@PathVariable long id_adresse){
        return adresseService.getAdresse(id_adresse);
    }
    @DeleteMapping("/Adresse/delete/{id_adresse}")
    public void deleteAdresse(@PathVariable long id_adresse){
        adresseService.deleteAdresse(id_adresse);
    }
    @PostMapping("/Adresse/add")
    public Adresse addAdresse(@RequestBody Adresse Adresse){
        return  adresseService.addAdresse(Adresse);
    }
    @PutMapping("/Adresse/update/{id_adresse}")
    public String updateAdresse(@PathVariable long id_adresse, @RequestBody Adresse Adresse){
        adresseService.addAdresse(Adresse);
        return "LE STRING LA DERANGE";
    }
}
