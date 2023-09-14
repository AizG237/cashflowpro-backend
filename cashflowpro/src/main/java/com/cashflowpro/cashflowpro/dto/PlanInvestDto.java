package com.cashflowpro.cashflowpro.dto;

import com.cashflowpro.cashflowpro.modele.Broker;
import com.cashflowpro.cashflowpro.modele.Utilisateur;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Builder
@Data
public class PlanInvestDto {
    private long id_planinvest;

    private String nominvest;

    private int dureemin;

    private Date dateinit;

    private String nomactif;

    private int montantmin;

    private Broker broker;

    private UtilisateurDto utilisateurDto;

    private List<UtilisateurDto> utilisateursDtos;
}
