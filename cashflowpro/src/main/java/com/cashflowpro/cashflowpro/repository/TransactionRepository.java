package com.cashflowpro.cashflowpro.repository;

import com.cashflowpro.cashflowpro.modele.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
