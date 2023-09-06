package com.cashflowpro.cashflowpro.cfpController;

import com.cashflowpro.cashflowpro.modele.Broker;
import com.cashflowpro.cashflowpro.service.BrokerService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Broker")
@AllArgsConstructor
public class BrokerController {
    private final BrokerService brokerService;
   // @Autowired
    //  private BrokerService cfpservice;
    @GetMapping("/getAll")
    public List<Broker> getBroker(){
        //Broker Brokers = new Broker("DOnfack","Pavel","Login","123", Broker.Role.Broker);
        return brokerService.getAllBroker();
    }
    @GetMapping("/get/{id_broker}")
    public Broker getBroker(@PathVariable long id_broker){
        return brokerService.getBroker(id_broker);
    }
    @DeleteMapping("/delete/{id_broker}")
    public void deleteBroker(@PathVariable long id_broker){
        brokerService.deleteBroker(id_broker);
    }
    @PostMapping("/add")
    public Broker addBroker(@RequestBody Broker Broker){
        return  brokerService.addBroker(Broker);
    }
    @PutMapping("/update/{id_broker}")
    public String updateBroker(@PathVariable long id_broker, @RequestBody Broker Broker){
        brokerService.addBroker(Broker);
        return "LE STRING LA DERANGE";
    }
}
