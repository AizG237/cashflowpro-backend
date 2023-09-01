package com.cashflowpro.cashflowpro.service;

import com.cashflowpro.cashflowpro.modele.Adresse;
import com.cashflowpro.cashflowpro.repository.AdresseRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service

public class AdresseService implements AdresseServiceImpl {
private final AdresseRepository adresseRepository;
    @Override
    public Adresse getAdresse(long id_adresse) {
        return adresseRepository.findById(id_adresse).orElseThrow(() -> new RuntimeException("Adresse inexistante"));
    }

    @Override
    public List<Adresse> getAllAdresse() {
        return adresseRepository.findAll();
    }

    @Override
    public String deleteAdresse(long id_adresse) {
        adresseRepository.deleteById(id_adresse);
        return "Adresse supprimée";
    }

    @Override
    public Adresse addAdresse(Adresse adresse) {
        return adresseRepository.save(adresse);
    }

    @Override
    public Adresse updateAdresse(long id_adresse, Adresse adresse) {
        return adresseRepository.findById(id_adresse).map( add ->{
            add.setPays(adresse.getPays());
            add.setRegion(adresse.getRegion());
            add.setVille(adresse.getVille());
            add.setQuartier(adresse.getQuartier());
            add.setPobox(adresse.getPobox());
            return adresseRepository.save(add);
        }).orElseThrow(() -> new RuntimeException("Erreur de mise à jour de l'adresse"));
    }
}
