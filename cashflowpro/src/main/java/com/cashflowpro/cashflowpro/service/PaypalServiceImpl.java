package com.cashflowpro.cashflowpro.service;

import com.cashflowpro.cashflowpro.modele.Paypal;

import java.util.List;

public interface PaypalServiceImpl {
    //create
    Paypal addPaypal(Paypal p);
    //Read
    Paypal getPaypal(long id);
    //Read all
    List<Paypal> getAllPaypal();
    //update
    Paypal updatePaypal(long id, Paypal p);
    //delete
    String deletePaypal(long id);
}
