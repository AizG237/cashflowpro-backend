package com.cashflowpro.cashflowpro.cfpController;

import com.cashflowpro.cashflowpro.service.ClientInterface;
import com.cashflowpro.cashflowpro.service.ClientService;
import com.cashflowpro.cashflowpro.modele.Client;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Client")
@AllArgsConstructor
public class ClientController {
    private final ClientInterface clientInterface;
    // @Autowired
    //  private ClientService cfpservice;
    @GetMapping("/getAll")
    public List<Client> getClient(){
        //Client Clients = new Client("DOnfack","Pavel","Login","123", Client.Role.Client);
        return clientInterface.getAllClient();
    }
    @GetMapping("/get/{matricule}")
    public Client getClient(@PathVariable long matricule){
        return clientInterface.getClient(matricule);
    }
    @DeleteMapping("/delete/{matricule}")
    public void deleteClient(@PathVariable long matricule){
        clientInterface.deleteCLient(matricule);
    }
    @PostMapping("/add")
    public Client addClient(@RequestBody Client client){
        return  clientInterface.addClient(client);
    }
    @PutMapping("/update/{matricule}")
    public String updateClient(@PathVariable long matricule, @RequestBody Client client){
        clientInterface.addClient(client);
        return "Client ajouté";
    }
}
