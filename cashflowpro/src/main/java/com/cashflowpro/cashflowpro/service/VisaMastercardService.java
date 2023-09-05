package com.cashflowpro.cashflowpro.service;

import com.cashflowpro.cashflowpro.modele.VisaMastercard;
import com.cashflowpro.cashflowpro.repository.VisaMastercardRepository;
import com.cashflowpro.cashflowpro.repository.VisaMastercardRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class VisaMastercardService implements VisaMastercardServiceImpl{
    private final VisaMastercardRepository visaMastercardRepository;
    @Override
    public VisaMastercard getCompte(long id_compte) {
        return visaMastercardRepository.findById(id_compte).orElseThrow(() ->new RuntimeException("Compte pas trouve"));
    }

    @Override
    public String deleteCompte(long id_compte) {
        visaMastercardRepository.deleteById(id_compte);
        return "Compte supprimé";
    }

    @Override
    public VisaMastercard addCompte(VisaMastercard visaMastercard) {
        return visaMastercardRepository.save(visaMastercard);
    }

    @Override
    public VisaMastercard updateCompte(long id_compte, VisaMastercard visaMastercard) {
        return visaMastercardRepository.findById(id_compte).map(cpt ->{
            cpt.setDate_creation(visaMastercard.getDate_creation());
            cpt.setCcv(visaMastercard.getCcv());
            cpt.setNumerocarte(visaMastercard.getNumerocarte());
            return visaMastercardRepository.save(cpt);
                }
        ).orElseThrow(() -> new RuntimeException(" Erreur mise à jour du compte") );
    }
}
