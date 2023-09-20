package com.cashflowpro.cashflowpro.dto;

import com.cashflowpro.cashflowpro.modele.Client;
import com.cashflowpro.cashflowpro.modele.PlanInvest;
import com.cashflowpro.cashflowpro.modele.Utilisateur;
import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@Data
public class ClientDto extends UtilisateurDto {
    private String email;
    private String pays_origine;
    private String profession;
    private String piece_identite;

/*    public ClientDto fromEntity(Client client){
        if (client == null){
            return null;
        }
        ClientDto clientDto = new ClientDto();
        //clientDto
        return clientDto;
    }*/
    public Client toEntity(ClientDto clientDto){
        if (clientDto == null){
            return null;
        }
        Client client = new Client();
        client.setEmail(clientDto.getEmail());
        client.setTelephone(client.getTelephone());
        client.setNom(clientDto.getNom());
        client.setPrenom(clientDto.getPrenom());
        client.setPwd(clientDto.getPwd());
        client.setDatenaiss(clientDto.getDatenaiss());
        client.setPays_origine(clientDto.getPays_origine());
        client.setPiece_identite(clientDto.getPiece_identite());
        client.setProfession(clientDto.getProfession());
        client.setMatricule(clientDto.getMatricule());
       // client.setPlanInvests((List<PlanInvest>) clientDto.getPlanInvestDto());//  client.setPlanInvests(new ArrayList<>
        return client;
    }
    public ClientDto fromEntity(Client client){
        if(client == null){ return null;}

        ClientDto clientDto = new ClientDto();
        clientDto.setEmail(client.getEmail());
        clientDto.setNom(client.getNom());
        clientDto.setPrenom(client.getPrenom());
        clientDto.setProfession(client.getProfession());
        clientDto.setDatenaiss(client.getDatenaiss());
        clientDto.setPwd(client.getPwd());
       // clientDto.setRole(client.getRole());
        clientDto.setPays_origine(client.getPays_origine());
        clientDto.setTelephone(client.getTelephone());

        return clientDto;

       /* return ClientDto.builder()
                .email(client.getEmail())
                .piece_identite(client.getPiece_identite())
                .profession(client.getProfession())
                .build();*/
    }
}
