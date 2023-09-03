package com.cashflowpro.cashflowpro.repository;

import com.cashflowpro.cashflowpro.modele.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
