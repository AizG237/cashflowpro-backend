package com.cashflowpro.cashflowpro.repository;

import com.cashflowpro.cashflowpro.modele.Broker;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BrokerRepository extends JpaRepository<Broker, Long> {

    Optional<Broker> findByNom(String nom);
}
