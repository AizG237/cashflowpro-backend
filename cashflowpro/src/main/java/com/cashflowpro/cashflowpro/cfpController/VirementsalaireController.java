package com.cashflowpro.cashflowpro.cfpController;

import com.cashflowpro.cashflowpro.modele.Virementsalaire;
import com.cashflowpro.cashflowpro.service.VirementsalaireInterface;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/virement_salaire")
@RestController
@AllArgsConstructor
public class VirementsalaireController {
    private final VirementsalaireInterface VirementsalaireInterface;

    @PostMapping("/add")
    public Virementsalaire addVirementsalaire(@RequestBody Virementsalaire Virementsalaire){
        return VirementsalaireInterface.addVirement(Virementsalaire);
    }
    @GetMapping("/get/{id}")
    public Virementsalaire getVirementsalaire(@PathVariable long id){
        return VirementsalaireInterface.getVirement(id);
    }
    @GetMapping("/get/all")
    public List<Virementsalaire> getAllVirementsalaire(){
        return VirementsalaireInterface.getAllVirement();
    }
    @PutMapping("/update/{id}")
    public Virementsalaire  updateVirementsalaire(@PathVariable long id, @RequestBody Virementsalaire Virementsalaire){
        return VirementsalaireInterface.updateVirement(id, Virementsalaire);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteVirementsalaire(@PathVariable long id){
        return VirementsalaireInterface.deleteVirement(id);
    }
}
