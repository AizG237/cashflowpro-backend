package com.cashflowpro.cashflowpro.service;

import com.cashflowpro.cashflowpro.modele.Client;

import java.util.List;

public interface ClientInterface {
    //create
    Client addClient(Client client);
    //Read
    Client getClient(long matricule);
    //ReadAll
    List <Client> getAllClient();
    //update
    Client  updateClient(long matricule, Client client);
    //delete
    String deleteCLient(long matricule);
}
