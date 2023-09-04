package com.cashflowpro.cashflowpro.service;

import com.cashflowpro.cashflowpro.modele.Mtnmomo;
import com.cashflowpro.cashflowpro.repository.MtnmomoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MtnmomoService implements MtnMomoServiceImpl{
    private final MtnmomoRepository mtnmomoRepository;
    @Override
    public Mtnmomo addMtnmomo(Mtnmomo mtnmomo) {
        return mtnmomoRepository.save(mtnmomo);
    }

    @Override
    public Mtnmomo getMtnmomo(long id) {
        return mtnmomoRepository.findById(id).orElseThrow(()-> new RuntimeException("Erreur, compte MTN momo n'existe pas ou n'est pas lié à votre compte Cashflow Pro"));
    }

    @Override
    public List<Mtnmomo> getAllMtnmomo() {
        return mtnmomoRepository.findAll() ;
    }

    @Override
    public Mtnmomo updateMtnmomo(long id, Mtnmomo mtnmomo) {
        return mtnmomoRepository.findById(id).map(momo->{
            momo.setNomoperateur(mtnmomo.getNomoperateur());
            momo.setIndicatifpays(mtnmomo.getIndicatifpays());
            momo.setNumero(mtnmomo.getNumero());
            momo.setNomvalidation(mtnmomo.getNomvalidation());
            return mtnmomoRepository.save(momo);
        }).orElseThrow(() -> new RuntimeException("Erreur mise à jour des informations du compte MTN MOMO lié à votre compte Cashflow pro"));
    }

    @Override
    public String deleteMtnmomo(long id) {
        mtnmomoRepository.deleteById(id);
        return "Compte MTN money supprimé avec succès";
    }
}
