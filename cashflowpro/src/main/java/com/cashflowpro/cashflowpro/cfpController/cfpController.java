package com.cashflowpro.cashflowpro.cfpController;

import com.cashflowpro.cashflowpro.cfpController.service.cfpService;
import com.cashflowpro.cashflowpro.modele.Employe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class cfpController {
    @Autowired
    private cfpService cfpservice;
    @RequestMapping("/employe/getAll")
   public List<Employe> getEmploye(){
   //Employe employes = new Employe("DOnfack","Pavel","Login","123", Employe.Role.EMPLOYE);
    return cfpservice.getEmployes() ;
   }
   @RequestMapping("/employe/get/{matricule}")
    public Employe getEmploye(@PathVariable long matricule){
        return cfpService.getEmploye(matricule);
    }
    @RequestMapping(method = RequestMethod.DELETE, value = "/employe/delete/{matricule}")
    public void deleteEmploye(@PathVariable long matricule){
        cfpService.deleteEmploye(matricule);
    }
    @RequestMapping(method = RequestMethod.POST, value = "/employe/add")
    public void addEmploye(@RequestBody Employe employe){
        cfpService.addEmploye(employe);
    }
    @RequestMapping(method = RequestMethod.PUT,value = "/employe/update/{matricule}")
    public void updateEmploye(@RequestBody Employe employe, @PathVariable long matricule){
        cfpService.updateEmploye(employe, matricule);
    }
}
