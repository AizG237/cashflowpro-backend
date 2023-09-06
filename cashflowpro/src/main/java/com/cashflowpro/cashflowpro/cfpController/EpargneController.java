package com.cashflowpro.cashflowpro.cfpController;

import com.cashflowpro.cashflowpro.modele.Epargne;
import com.cashflowpro.cashflowpro.service.EpargneInterface;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/epargne")
@RestController
@AllArgsConstructor
public class EpargneController {
    private final EpargneInterface epargneInterface;

    @PostMapping("/add")
    public Epargne addEpargne(@RequestBody Epargne epargne){
        return epargneInterface.addEpargne(epargne);
    }
    @GetMapping("/get/{id}")
    public Epargne getEpargne(@PathVariable long id){
        return epargneInterface.getEpargne(id);
    }
    @GetMapping("/get/all")
    public List<Epargne> getAllEpargne(){
        return epargneInterface.getAllEpargne();
    }
    @PutMapping("/update/{id}")
    public Epargne  updateEpargne(@PathVariable long id, @RequestBody Epargne epargne){
        return epargneInterface.updateEpargne(id, epargne);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteEpargne(@PathVariable long id){
        return epargneInterface.deleteEpargne(id);
    }
}
