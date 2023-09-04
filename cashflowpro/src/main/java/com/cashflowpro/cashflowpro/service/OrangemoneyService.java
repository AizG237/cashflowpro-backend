package com.cashflowpro.cashflowpro.service;

import com.cashflowpro.cashflowpro.modele.Orangemoney;
import com.cashflowpro.cashflowpro.repository.OrangemoneyRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OrangemoneyService implements OrangemoneyServiceImpl{
    private final OrangemoneyRepository OrangemoneyRepository;
    @Override
    public Orangemoney addOrangemoney(Orangemoney Orangemoney) {
        return OrangemoneyRepository.save(Orangemoney);
    }

    @Override
    public Orangemoney getOrangemoney(long id) {
        return OrangemoneyRepository.findById(id).orElseThrow(()-> new RuntimeException("Erreur, compte MTN momo n'existe pas ou n'est pas lié à votre compte Cashflow Pro"));
    }

    @Override
    public List<Orangemoney> getAllOrangemoney() {
        return OrangemoneyRepository.findAll() ;
    }

    @Override
    public Orangemoney updateOrangemoney(long id, Orangemoney Orangemoney) {
        return OrangemoneyRepository.findById(id).map(momo->{
            momo.setNomoperateur(Orangemoney.getNomoperateur());
            momo.setIndicatifpays(Orangemoney.getIndicatifpays());
            momo.setNumero(Orangemoney.getNumero());
            momo.setNomvalidation(Orangemoney.getNomvalidation());
            return OrangemoneyRepository.save(momo);
        }).orElseThrow(() -> new RuntimeException("Erreur mise à jour des informations du compte MTN MOMO lié à votre compte Cashflow pro"));
    }

    @Override
    public String deleteOrangemoney(long id) {
        OrangemoneyRepository.deleteById(id);
        return "Compte MTN money supprimé avec succès";
    }
}
