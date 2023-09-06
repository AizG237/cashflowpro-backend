package com.cashflowpro.cashflowpro.modele;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "planinvest")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlanInvest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id_planinvest;
    @Column
    private String nominvest;
    @Column
    private int dureemin;
    @Column
    private Date dateinit;
    @Column
    private String nomactif;
    @Column
    private int montantmin;
    @ManyToOne @JoinColumn(name = "id_borker")
    private Broker broker;
    @ManyToOne @JoinColumn(name = "matricule")
    private Utilisateur utilisateur;
    @ManyToMany
 @JoinTable(name = "planepargne",
         joinColumns = @JoinColumn(name = "id_planinvest"),
          inverseJoinColumns = @JoinColumn(name = "matricule"))
 private List<Utilisateur> utilisateurs;

}
