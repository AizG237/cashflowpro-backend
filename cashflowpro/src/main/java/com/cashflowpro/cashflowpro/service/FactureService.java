package com.cashflowpro.cashflowpro.service;

import com.cashflowpro.cashflowpro.modele.Facture;
import com.cashflowpro.cashflowpro.repository.FactureRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

@AllArgsConstructor
public class FactureService implements FactureServiceImpl{
    private final FactureRepository factureRepository;
    @Override
    public Facture getFacture(long id_facture) {
        return factureRepository.findById(id_facture).orElseThrow(() -> new RuntimeException("Facture non trouvee !!"));
    }

    @Override
    public List<Facture> getAllFacture() {
        return factureRepository.findAll();
    }

    @Override
    public String deleteFacture(long id_facture) {
         factureRepository.deleteById(id_facture);
         return "Facture supprimée !!!";
    }

    @Override
    public Facture addFacture(Facture facture) {
        return factureRepository.save(facture);
    }

    @Override
    public Facture updateFacture(Long id_facture, Facture facture) {
        return factureRepository.findById(id_facture).map(fact->{
            fact.setEtat(facture.getEtat());
            fact.setMontant(facture.getMontant());
            fact.setDelai(facture.getDelai());
            fact.setNomsociete(facture.getNomsociete());
            fact.setDate_reception(facture.getDate_reception());
            return factureRepository.save(fact);
        }).orElseThrow(() -> new RuntimeException("Erreur de mise à jour des informations de la facture !!!"));
    }
}
