package com.cashflowpro.cashflowpro.cfpController;

import com.cashflowpro.cashflowpro.cfpController.service.cfpService;
import com.cashflowpro.cashflowpro.modele.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class cfpController {
    @Autowired
    private cfpService cfpservice;
    @RequestMapping("/employe/getAll")
   public List<Utilisateur> getEmploye(){
   //Employe employes = new Employe("DOnfack","Pavel","Login","123", Employe.Role.EMPLOYE);
    return cfpservice.getEmployes() ;
   }
   @RequestMapping("/employe/get/{matricule}")
    public Utilisateur getEmploye(@PathVariable long matricule){
        return cfpService.getEmploye(matricule);
    }
    @RequestMapping(method = RequestMethod.DELETE, value = "/employe/delete/{matricule}")
    public void deleteEmploye(@PathVariable long matricule){
        cfpService.deleteEmploye(matricule);
    }
    @RequestMapping(method = RequestMethod.POST, value = "/employe/add")
    public void addEmploye(@RequestBody Utilisateur utilisateur){
        cfpService.addEmploye(utilisateur);
    }
    @RequestMapping(method = RequestMethod.PUT,value = "/employe/update/{matricule}")
    public void updateEmploye(@RequestBody Utilisateur utilisateur, @PathVariable long matricule){
        cfpService.updateEmploye(utilisateur, matricule);
    }
}
