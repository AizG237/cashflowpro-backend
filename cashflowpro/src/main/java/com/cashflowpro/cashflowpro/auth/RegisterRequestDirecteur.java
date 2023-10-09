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
public class RegisterRequestDirecteur {

    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private Date datenaiss;
    private long telephone;
    private String matricule;
    private int salaire;
    private String role = "DIRECTEUR";
}
