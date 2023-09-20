package com.cashflowpro.cashflowpro.dto;

import com.cashflowpro.cashflowpro.modele.PlanInvest;
import com.cashflowpro.cashflowpro.modele.Role;
import com.cashflowpro.cashflowpro.modele.Utilisateur;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UtilisateurDto {
    private long matricule;
    protected String nom;
    protected String prenom;
    protected String email;
    protected String pwd;
   //protected float compte;
    protected Date datenaiss;
    protected long telephone;
   //protected PlanInvestDto planInvestDto;
   //private List<PlanInvestDto> planInvestsDto;
    private Role role;

    public UtilisateurDto fromEntity(Utilisateur utilisateur){
        if (utilisateur == null){
            return  null;
        }
        UtilisateurDto utilisateurDto =new UtilisateurDto();
        utilisateurDto.setMatricule(utilisateur.getMatricule());
        utilisateurDto.setNom(utilisateur.getNom());
        utilisateurDto.setPrenom(utilisateur.getPrenom());
        utilisateurDto.setEmail(utilisateur.getEmail());
        utilisateurDto.setPwd(utilisateur.getPwd());
        utilisateurDto.setDatenaiss(utilisateur.getDatenaiss());
        utilisateurDto.setTelephone(utilisateur.getTelephone());
       // utilisateurDto.Role.valu(Utilisateur.Role.EMPLOYE);
        return utilisateurDto;
    }

    public Utilisateur toEntity(UtilisateurDto utilisateurDto){
        if (utilisateurDto == null){
            return  null;
        }
        Utilisateur utilisateur =new Utilisateur();
        utilisateur.setMatricule(utilisateurDto.getMatricule());
        utilisateur.setNom(utilisateurDto.getNom());
        utilisateur.setPrenom(utilisateurDto.getPrenom());
        utilisateur.setEmail(utilisateurDto.getEmail());
        utilisateur.setPwd(utilisateurDto.getPwd());
        utilisateur.setDatenaiss(utilisateurDto.getDatenaiss());
        utilisateur.setTelephone(utilisateurDto.getTelephone());
        //utilisateur.setRole(utilisateurDto.getRole());
        return utilisateur;
    }


}
