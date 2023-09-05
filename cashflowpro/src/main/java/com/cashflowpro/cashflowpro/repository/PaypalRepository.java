package com.cashflowpro.cashflowpro.repository;

import com.cashflowpro.cashflowpro.modele.Paypal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaypalRepository extends JpaRepository<Paypal, Long> {
}
