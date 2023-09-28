package com.cashflowpro.cashflowpro.modele;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
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


    @Id
    private String email;
    @Column
    private String pays_origine;
    @Column
    private String profession;
    @Column
    private String piece_identite;

}
