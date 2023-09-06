package com.cashflowpro.cashflowpro.cfpController;

import com.cashflowpro.cashflowpro.modele.Paypal;
import com.cashflowpro.cashflowpro.service.PaypalServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@AllArgsConstructor
@RequestMapping("/paypal")

public class PaypalController {
    private final PaypalServiceImpl PaypalService;

    @PostMapping("/add")
    public void ajouterPaypal(@RequestBody Paypal Paypal){
        PaypalService.addPaypal(Paypal);
    }

    //read
    @GetMapping("/get/{id}")
    public Paypal trouverPaypal(@PathVariable long id){

        return PaypalService.getPaypal(id);
    }

    //readAll
    @GetMapping("/get/all")
    public List<Paypal> trouverAllPaypal(){
        return PaypalService.getAllPaypal();
    }
    //update
    @PutMapping("/update/{id}")
    public Paypal updatePaypal(@PathVariable long id, @RequestBody Paypal Paypal){
        return PaypalService.updatePaypal(id,Paypal);
    }
    //delete
    @DeleteMapping("/delete/{id}")
    public String supprimerPaypal(@PathVariable long id){
        return PaypalService.deletePaypal(id);
    }
}
