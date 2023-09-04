package com.cashflowpro.cashflowpro.cfpController;

import com.cashflowpro.cashflowpro.modele.PlanInvest;
import com.cashflowpro.cashflowpro.service.PlanInvestService;
import com.cashflowpro.cashflowpro.service.PlanInvestServiceImpl;
import lombok.Data;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/plan_investissement")
@Data
public class PlanInvestController {
    private final PlanInvestServiceImpl planInvestService;

    @PostMapping("/add")
    public void ajouterPlaninvest(@RequestBody PlanInvest Planinvest){
      planInvestService.addPlaninvest(Planinvest);
    }

    //read
    @GetMapping("/get/{id}")
    public PlanInvest trouverPlaninvest(@PathVariable long id){

        return planInvestService.getPlaninvest(id);
    }

    //readAll
    @GetMapping("get/all")
    public List<PlanInvest> trouverAllPlaninvest(){
        return planInvestService.getAllPlaninvest();
    }
    //update
    @PutMapping("/update/{id}")
    public PlanInvest updatePlaninvest(@PathVariable long id, @RequestBody PlanInvest Planinvest){
        return planInvestService.updatePlaninvest(id,Planinvest);
    }
    //delete
    @DeleteMapping("/delete/{id}")
    public String supprimerPlaninvest(@PathVariable long id){
        return planInvestService.deletePlaninvest(id);
    }
}
