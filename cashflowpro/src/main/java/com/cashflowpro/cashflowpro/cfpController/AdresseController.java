
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
@AllArgsConstructor
@RequestMapping("/adresse")
public class AdresseController {
    //@Autowired
    private final AdresseServiceImpl adresseServiceImp;

    @GetMapping("/getAll")
    public List<Adresse> getAdresse(){
        //Adresse Adresses = new Adresse("DOnfack","Pavel","Login","123", Adresse.Role.Adresse);
        return adresseServiceImp.getAllAdresse();
    }
    @GetMapping("/get/{id_adresse}")
    public Adresse getAdresse(@PathVariable long id_adresse){
        return adresseServiceImp.getAdresse(id_adresse);
    }
    @DeleteMapping("/delete/{id_adresse}")
    public void deleteAdresse(@PathVariable long id_adresse){
        adresseServiceImp.deleteAdresse(id_adresse);
    }
    @PostMapping("/add")
    public Adresse addAdresse(@RequestBody Adresse Adresse){
        return  adresseServiceImp.addAdresse(Adresse);
    }
    @PutMapping("/update/{id_adresse}")
    public String updateAdresse(@PathVariable long id_adresse, @RequestBody Adresse Adresse){
        adresseServiceImp.addAdresse(Adresse);
        return "LE STRING LA DERANGE";
    }
}
