package com.cashflowpro.cashflowpro.service;

import com.cashflowpro.cashflowpro.modele.Prestation;
import com.cashflowpro.cashflowpro.repository.PrestationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class PrestationService implements PrestationServiceImpl {
private final PrestationRepository prestationRepository;
    @Override
    public Prestation addPrestation(Prestation prestation) {
        return prestationRepository.save(prestation);
    }

    @Override
    public Prestation getPrestation(long id) {
        return prestationRepository.findById(id).orElseThrow(() -> new RuntimeException("Prestation jamais initiée et inexistante"));
    }

    @Override
    public List<Prestation> getAllPrestation() {
        return prestationRepository.findAll();
    }

    @Override
    public Prestation updatePrestation(Long id, Prestation prestation) {
        return prestationRepository.findById(id)
                .map(p ->{
                    p.setDomaine(prestation.getDomaine());
                    p.setLibelle(prestation.getLibelle());
                    p.setDuree(prestation.getDuree());
                    p.setMontant_paye(prestation.getMontant_paye());
                    p.setMontant_total(prestation.getMontant_total());
                    p.setNom_projet(prestation.getNom_projet());
                    return prestationRepository.save(p);
                }).orElseThrow(() -> new RuntimeException("Erreur de mise à jour de la prestation"));
    }

    @Override
    public String deletePrestation(long id) {
        prestationRepository.deleteById(id);
        return "Prestation supprimée";
    }
}
