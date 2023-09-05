package com.cashflowpro.cashflowpro.service;

import com.cashflowpro.cashflowpro.modele.Wallet;

import java.util.List;

public interface WalletServiceImpl {
    //create
    Wallet addWallet(Wallet p);
    //Read
    Wallet getWallet(long id);
    //Read all
    List<Wallet> getAllWallet();
    //update
    Wallet updateWallet(long id, Wallet p);
    //delete
    String deleteWallet(long id);
}
