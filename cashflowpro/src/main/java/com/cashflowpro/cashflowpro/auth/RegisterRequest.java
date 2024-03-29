package com.cashflowpro.cashflowpro.auth;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {

    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private Date datenaiss;
    private long telephone;
    private String role = "CLIENT";
    private String pays_origine;
    private String profession;
    private String piece_identite;


}
