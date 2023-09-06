package com.cashflowpro.cashflowpro.service;

import com.cashflowpro.cashflowpro.modele.Epargne;
import com.cashflowpro.cashflowpro.repository.EpargneRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
 @Service
 @AllArgsConstructor
public class EpargneImpl implements EpargneInterface{
     private final EpargneRepository epargneRepository;
    @Override
    public Epargne addEpargne(Epargne epargne) {
        return epargneRepository.save(epargne);
    }

    @Override
    public Epargne getEpargne(long id) {
        return epargneRepository.findById(id).orElseThrow(() -> new RuntimeException("Aucun plan d'investissement n'est trouvé"));
    }

     @Override
     public List<Epargne> getAllEpargne() {
         return epargneRepository.findAll();
     }

/*    @Override
    public List<Epargne> getAllEpargne(long id) {
        return n;
    }*/

    @Override
    public Epargne updateEpargne(long id, Epargne epargne) {
        return epargneRepository.findById(id).map(e->{
            e.setDatesouscription(epargne.getDatesouscription());
            e.setDuree(epargne.getDuree());
            e.setMontantmensuel(epargne.getMontantmensuel());
            return epargneRepository.save(e);
        }).orElseThrow(()-> new RuntimeException("Erreur de mise à jour des informations du plan d'investissement"));
    }

    @Override
    public String deleteEpargne(long id) {
         epargneRepository.deleteById(id);
        return "Vous venez de vous désinscrire du plan d'investissement ";}
}
