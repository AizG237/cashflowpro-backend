package com.cashflowpro.cashflowpro.cfpController;

import com.cashflowpro.cashflowpro.modele.Orangemoney;
import com.cashflowpro.cashflowpro.service.OrangemoneyServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Orangemoney")

public class OrangemoneyController {
    private final OrangemoneyServiceImpl OrangemoneyService;

    @PostMapping("/add")
    public void ajouterOrangemoney(@RequestBody Orangemoney Orangemoney){
        OrangemoneyService.addOrangemoney(Orangemoney);
    }

    //read
    @GetMapping("/get/{id}")
    public Orangemoney trouverOrangemoney(@PathVariable long id){

        return OrangemoneyService.getOrangemoney(id);
    }

    //readAll
    @GetMapping("get/all")
    public List<Orangemoney> trouverAllOrangemoney(){
        return OrangemoneyService.getAllOrangemoney();
    }
    //update
    @PutMapping("/update/{id}")
    public Orangemoney updateOrangemoney(@PathVariable long id, @RequestBody Orangemoney Orangemoney){
        return OrangemoneyService.updateOrangemoney(id,Orangemoney);
    }
    //delete
    @DeleteMapping("/delete/{id}")
    public String supprimerOrangemoney(@PathVariable long id){
        return OrangemoneyService.deleteOrangemoney(id);
    }
    
}
