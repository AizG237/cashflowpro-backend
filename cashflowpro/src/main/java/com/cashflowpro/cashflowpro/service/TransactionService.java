package com.cashflowpro.cashflowpro.service;

import com.cashflowpro.cashflowpro.modele.Transaction;
import com.cashflowpro.cashflowpro.repository.TransactionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service

public class TransactionService implements TransactionServiceImpl{
    private final TransactionRepository transactionRepository;
    @Override
    public Transaction getTransact(long id_transact) {
        return transactionRepository.findById(id_transact).orElseThrow(() -> new RuntimeException("Transaction jamais effectuée !!"));
    }

    @Override
    public List<Transaction> getAllTransaction() {
        return transactionRepository.findAll();
    }
/*
    @Override
    public String deleteTransact(long id_transact) {
        transactionRepository.deleteById(id_transact);
        return "Transaction supprimée !!"
    }*/

    @Override
    public Transaction addTransact(Transaction transaction) {
        return transactionRepository.save(transaction);
    }
/*
    @Override
    public Transaction updateTransact(Long id_compte, Transaction transaction) {
        return transactionRepository.findById(id_compte).map(tr->{
            tr.setDate_effect(transaction.getDate_effect());
            tr.setDate_effect(transaction.getDate_effect());
            return transactionRepository.save(tr);
        }).orElseThrow(() -> new RuntimeException("transaction non mise à jour. Erreur !!!"));
    }*/
}
