package com.cashflowpro.cashflowpro.dto;

import com.cashflowpro.cashflowpro.modele.PlanInvest;
import com.cashflowpro.cashflowpro.modele.Utilisateur;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;
@Builder
@Data
public class UtilisateurDto {
    private long matricule;

    protected String nom;

    protected String prenom;

    protected String email;

    protected String pwd;


    protected float compte;

    protected Date datenaiss;

    protected long telephone;

    private List<PlanInvestDto> planInvestsDto;
    private RoleDto roleDto;

}
