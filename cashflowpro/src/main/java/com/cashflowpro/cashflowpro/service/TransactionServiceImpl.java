package com.cashflowpro.cashflowpro.service;

import com.cashflowpro.cashflowpro.modele.Transaction;

import java.util.List;

public interface TransactionServiceImpl {
    Transaction getTransact(long id_transact);

    List<Transaction> getAllTransaction();

   // String deleteTransact(long id_transact);
    Transaction addTransact(Transaction transaction);
  //  Transaction updateTransact(Long id_compte, Transaction transaction); // Pourquoi ça doit être "Long" au lieu de "long"??,

}
