package com.cashflowpro.cashflowpro.cfpController;

import com.cashflowpro.cashflowpro.dto.PlanInvestDto;
import com.cashflowpro.cashflowpro.modele.PlanInvest;
import com.cashflowpro.cashflowpro.service.PlanInvestDtoImpl;
import com.cashflowpro.cashflowpro.service.PlanInvestServiceImpl;
import lombok.Data;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequestMapping("/plan_investissement")
@Data
public class PlanInvestDtoController {
    private final PlanInvestDtoImpl planInvestDto;

    @PostMapping("/add")
    public String ajouterPlaninvest(@RequestBody PlanInvestDto planinvest) {
     return planInvestDto.addPlan(planinvest);
    }

    //read
    @GetMapping("/get/{plan}/{broker}")
    public PlanInvestDto trouverPlaninvest(@PathVariable String plan,@PathVariable String broker ){

        return planInvestDto.readPlan(plan, broker);
    }

    //readAll
//    @GetMapping("get/all")
//    public List<PlanInvestDto> trouverAllPlaninvest(){
//        return planInvestDto.readAll();
//    }
    //update
//    @PutMapping("/update/{id}")
//    public PlanInvest updatePlaninvest(@PathVariable long id, @RequestBody PlanInvest Planinvest){
//        return planInvestDto.updatePlan();
//    }
    //delete
    @DeleteMapping("/delete/{plan}/{broker}")
    public String supprimerPlaninvest(@PathVariable String nomPlan, String nomBroker){
        return planInvestDto.deletePlan(nomPlan,nomBroker);
    }
}
