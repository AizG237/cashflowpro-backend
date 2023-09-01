package com.cashflowpro.cashflowpro.cfpController;

import com.cashflowpro.cashflowpro.modele.Prestation;
import com.cashflowpro.cashflowpro.service.PrestationService;
import com.cashflowpro.cashflowpro.service.PrestationService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/prestation")
@AllArgsConstructor
@Getter
@Setter
public class PrestationController {
    private final PrestationService prestationService;
   // @Autowired
    // create
    @PostMapping("/add")
    public void ajouterPrestation(@RequestBody Prestation prestation){
        prestationService.addPrestation(prestation);
    }

    //read
    @GetMapping("/get/{id}")
    public Prestation trouverPrestation(@PathVariable long id){
        return prestationService.getPrestation(id);
    }

    //readAll
    @GetMapping("get/all")
    public List<Prestation> trouverAllPrestation(){
        return prestationService.getAllPrestation();
    }
    //update
    @PutMapping("/update/{id}")
    public Prestation updatePrestation(@PathVariable long id, @RequestBody Prestation prestation){
        return prestationService.updatePrestation(id,prestation);
    }
    //delete
    @DeleteMapping("/delete/{id}")
    public String supprimerPrestation(@PathVariable long id){
       return prestationService.deletePrestation(id);
    }
}
