package com.cashflowpro.cashflowpro.service;

import com.cashflowpro.cashflowpro.modele.Virementsalaire;
import com.cashflowpro.cashflowpro.repository.VirementsalaireRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class VirementsalaireService implements VirementsalaireInterface{
    private final VirementsalaireRepository virementsalaireRepository;
    @Override
    public Virementsalaire addVirement(Virementsalaire virementsalaire) {
        return virementsalaireRepository.save(virementsalaire);
    }

    @Override
    public Virementsalaire getVirement(long id) {
        return virementsalaireRepository.findById(id).orElseThrow(() -> new RuntimeException("Virement jamais effectué"));
    }

    @Override
    public List<Virementsalaire> getAllVirement() {
        return virementsalaireRepository.findAll();
    }

    @Override
    public Virementsalaire updateVirement(long id, Virementsalaire virementsalaire) {
        return virementsalaireRepository.findById(id).map(v->{
            v.setMotif(virementsalaire.getMotif());
            v.setMois(virementsalaire.getMois());
            v.setAnnee(virementsalaire.getAnnee());
            v.setDatevirement(virementsalaire.getDatevirement());
            return virementsalaireRepository.save(v);
        }).orElseThrow(()-> new RuntimeException("Informations de virement de salaire non modifé"));
    }

    @Override
    public String deleteVirement(long id) {
        return "Impossible de supprimer un virement";
    }
}
