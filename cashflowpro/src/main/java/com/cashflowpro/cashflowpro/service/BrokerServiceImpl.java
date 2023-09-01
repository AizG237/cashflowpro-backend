package com.cashflowpro.cashflowpro.service;

import com.cashflowpro.cashflowpro.modele.Broker;

import java.util.List;

public interface BrokerServiceImpl {
    Broker getBroker(long id_borker);
    List<Broker> getAllBroker();
    String deleteBroker(long id_broker);
    Broker addBroker(Broker broker);
    Broker updateBroker(long id_broker, Broker broker);

}
