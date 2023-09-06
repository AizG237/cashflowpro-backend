package com.cashflowpro.cashflowpro.modele;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.stereotype.Component;

@Entity
@Table(name = "paypal")
@Data
@Component
public class Paypal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_paypal;
    @Column
    private String email;
    @Column
    private String payscreation;
}
