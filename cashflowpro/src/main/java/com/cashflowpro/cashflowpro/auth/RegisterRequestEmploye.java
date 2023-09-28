package com.cashflowpro.cashflowpro.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequestEmploye {

    private String firstname;
    private String lastname;
    private String email;
    private String password = "azerty";
    private Date datenaiss;
    private long telephone;
    private String role = "EMPLOYE";
    private String matricule;
    private float salaire;
}
