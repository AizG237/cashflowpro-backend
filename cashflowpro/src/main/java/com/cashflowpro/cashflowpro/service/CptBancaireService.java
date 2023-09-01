package com.cashflowpro.cashflowpro.service;

import com.cashflowpro.cashflowpro.modele.Compte_bancaire;
import com.cashflowpro.cashflowpro.modele.Utilisateur;
import com.cashflowpro.cashflowpro.repository.CptBancaireRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CptBancaireService implements CptBancaireServiceImpl{
    private final CptBancaireRepository cptBancaireRepository;
    @Override
    public Compte_bancaire getCompte(long id_compte) {
        return cptBancaireRepository.findById(id_compte).orElseThrow(() ->new RuntimeException("Compte pas trouve"));
    }

    @Override
    public String deleteCompte(long id_compte) {
        cptBancaireRepository.deleteById(id_compte);
        return "Compte supprimé";
    }

    @Override
    public Compte_bancaire addCompte(Compte_bancaire compteBancaire) {
        return cptBancaireRepository.save(compteBancaire);
    }

    @Override
    public Compte_bancaire updateCompte(long id_compte, Compte_bancaire compteBancaire) {
        return cptBancaireRepository.findById(id_compte).map(cpt ->{
            cpt.setDate_creation(compteBancaire.getDate_creation());
            cpt.setPays(compteBancaire.getPays());
            cpt.setSolde(compteBancaire.getSolde());
            cpt.setSociete(compteBancaire.getSociete());
            cpt.setNumero(compteBancaire.getNumero());
            return cptBancaireRepository.save(cpt);
                }
        ).orElseThrow(() -> new RuntimeException(" Erreur mise à jour du compte") );
    }
}
