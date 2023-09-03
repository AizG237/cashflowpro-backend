package com.cashflowpro.cashflowpro.modele;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.management.relation.Role;
import java.util.Date;


@Entity
@Table (name = "client")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Client extends Utilisateur{



    private long email;
    @Column
    private String pays_origine;
    @Column
    private String profession;
    @Column
    private String piece_identite;
//@Autowired
    public Client(long matricule,String email, String nom, String prenom, String login, String pwd, Role role, float compte, Date datenaiss, long telephone, String pays_origine, String profession, String piece_identite) {

        super();
        this.email=matricule;
        this.pays_origine = pays_origine;
        this.profession = profession;
        this.piece_identite = piece_identite;
    }
}
