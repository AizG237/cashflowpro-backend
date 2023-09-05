package com.cashflowpro.cashflowpro.repository;

import com.cashflowpro.cashflowpro.modele.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WalletRepository extends JpaRepository<Wallet, Long> {
}
