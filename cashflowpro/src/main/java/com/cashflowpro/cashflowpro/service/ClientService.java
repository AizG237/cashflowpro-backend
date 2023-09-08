package com.cashflowpro.cashflowpro.service;

import com.cashflowpro.cashflowpro.modele.Client;
import com.cashflowpro.cashflowpro.repository.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class ClientService implements ClientInterface{
    private final ClientRepository clientRepository;
    @Override
    public Client addClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client getClient(long matricule) {
        return clientRepository.findById(matricule).orElseThrow(() -> new RuntimeException("Client non existant dans le système"));
    }

    @Override
    public List<Client> getAllClient() {
        return clientRepository.findAll();
    }

    @Override
    public Client updateClient(long matricule, Client client) {
        return clientRepository.findById(matricule).map(c->{
            c.setPiece_identite(client.getPiece_identite());
       /*     c.setNom(client.getNom());
            c.setPrenom(client.getPrenom());
            c.setLogin(client.getLogin());
            c.setPwd(client.getPwd());
            //c.setCompte(client.getCompte());
            c.setDatenaiss(client.getDatenaiss());
            c.setTelephone(client.getTelephone());*/
            c.setProfession(client.getProfession());
            c.setPays_origine(client.getPays_origine());
            c.setPays_origine(client.getPays_origine());
            return clientRepository.save(c);
        }).orElseThrow(() -> new RuntimeException("Erreur mise à jour des informations du client"));

    }

    @Override
    public String deleteCLient(long matricule) {
        return null;
    }
}
