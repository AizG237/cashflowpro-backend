package com.cashflowpro.cashflowpro.service;

import com.cashflowpro.cashflowpro.modele.Broker;
import com.cashflowpro.cashflowpro.repository.BrokerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service

public class BrokerService implements BrokerServiceImpl{
    private final BrokerRepository brokerRepository;
    @Override
    public Broker getBroker(long id_borker) {
        return brokerRepository.findById(id_borker).orElseThrow(() -> new RuntimeException("Broker non trouvé"));
    }

    @Override
    public List<Broker> getAllBroker() {
        return brokerRepository.findAll();
    }

    @Override
    public String deleteBroker(long id_broker) {
         brokerRepository.deleteById(id_broker);
        return "Broker supprimé"; // IL Y AURA UN TRAVAIL A FAIRE ICI PAR RAPPORT AUX INVESTISSEMENTS FAITS
    }

    @Override
    public Broker addBroker(Broker broker) {
        return  brokerRepository.save(broker);
    }

    @Override
    public Broker updateBroker(long id_broker, Broker broker) {
        return brokerRepository.findById(id_broker).map(br -> {
          br.setNom(broker.getNom());
          br.setSituation(broker.getSituation());
          br.setAutoriteregulation(broker.getAutoriteregulation());
          br.setDatecreation(broker.getDatecreation());
          br.setDateouverturecpt(broker.getDateouverturecpt());
          br.setCouverturefiscale(broker.getCouverturefiscale());
          return brokerRepository.save(br);
        }).orElseThrow(() -> new RuntimeException("Erreur mise à jour broker"));
    }
}
