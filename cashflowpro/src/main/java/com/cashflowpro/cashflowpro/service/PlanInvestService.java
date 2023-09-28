package com.cashflowpro.cashflowpro.service;

import com.cashflowpro.cashflowpro.modele.PlanInvest;
import com.cashflowpro.cashflowpro.repository.PlanInvestRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class PlanInvestService implements PlanInvestServiceImpl{
    private final PlanInvestRepository planInvestRepository;
    @Override
    public PlanInvest addPlaninvest(PlanInvest planInvest) {
        return planInvestRepository.save(planInvest);
    }

    @Override
    public PlanInvest getPlaninvest(long id) {
        return planInvestRepository.findById(id).orElseThrow(() -> new RuntimeException("Plan d'investissement non trouvé"));
    }

    @Override
    public List<PlanInvest> getAllPlaninvest() {
        return planInvestRepository.findAll();
    }

    @Override
    public PlanInvest updatePlaninvest(long id, PlanInvest planInvest) {
        return planInvestRepository.findById(id).map(pi ->{
            pi.setDateinit(planInvest.getDateinit());
           // pi.setDuree(planInvest.getDuree());
            pi.setNominvest(planInvest.getNominvest());
            pi.setMontantmin(planInvest.getMontantmin());
            pi.setDureemin(planInvest.getDureemin());
            pi.setNomactif(planInvest.getNomactif());
            pi.setRendementmoyen(planInvest.getRendementmoyen());
            return planInvestRepository.save(pi);
        }).orElseThrow(()-> new RuntimeException("Erreur mise à jour du plan d'investissement"));
    }

    @Override
    public String deletePlaninvest(long id) {
        planInvestRepository.deleteById(id);
        return "Plan d'investissement supprimé !!"; }
}
