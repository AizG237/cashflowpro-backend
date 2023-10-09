package com.cashflowpro.cashflowpro.service;

import com.cashflowpro.cashflowpro.dto.PlanInvestDto;
import com.cashflowpro.cashflowpro.modele.Broker;
import com.cashflowpro.cashflowpro.modele.PlanInvest;
import com.cashflowpro.cashflowpro.repository.BrokerRepository;
import com.cashflowpro.cashflowpro.repository.PlanInvestRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class PlanInvestDtoService implements PlanInvestDtoImpl{
    private final PlanInvestRepository planInvestRepository;
    private final BrokerRepository brokerRepository;


    @Override
    public String addPlan( PlanInvestDto planInvestDto) {

        planInvestRepository.save(planInvestDto.toEntityPlanInvest(planInvestDto));
        brokerRepository.save( planInvestDto.toEntityBroker(planInvestDto));
        planInvestRepository.findByNominvest(planInvestDto.getNominvest()).get().setBroker(planInvestDto.toEntityBroker(planInvestDto));
        return "Effectué";

    }

    @Override
    public PlanInvestDto readPlan(String nomPlan, String nomBroker) {
        planInvestRepository.findByNominvest(nomPlan);
       var id = brokerRepository.findByNom(nomBroker).get().getId_broker();
     var plan_trouve = planInvestRepository.findById(id);
       if (plan_trouve.isPresent()){
        PlanInvestDto planInvestDto =  new PlanInvestDto();
       return planInvestDto.fromEntity( planInvestRepository.findByNominvest(nomPlan).get(), brokerRepository.findByNom(nomBroker).get());
       }else{
           throw new RuntimeException(" Aucun plan d'investissement à ce nom n'existe ou n'est lié à ce broker ");
       }

    }

//    @Override
//    public List<PlanInvestDto> readAll() {
//
//        for (){
//        return List<PlanInvestDto>;
//        }
//    }

    @Override
    public PlanInvestDto updatePlan(String nomPlan, String nomBroker, PlanInvest planInvest, Broker broker) {
    long idPlan = planInvestRepository.findByNominvest(nomPlan).get().getBroker().getId_broker();
    long idBroker = brokerRepository.findByNom(nomBroker).get().getId_broker();
    if(idBroker == idPlan){
        planInvestRepository.findByNominvest(nomPlan).map( plan-> {
            plan.setNomactif(planInvest.getNomactif());
            plan.setNominvest(planInvest.getNominvest());
            plan.setRendementmoyen(planInvest.getRendementmoyen());
            plan.setDateinit(planInvest.getDateinit());
            plan.setMontantmin(planInvest.getMontantmin());
            plan.setDureemin(planInvest.getDureemin());
         return  planInvestRepository.save(plan);
        }).orElseThrow(() -> new RuntimeException("ERREUR ENREGISTREMENT PLAN "));

        brokerRepository.findByNom(nomBroker).map(b->{
            b.setNom(broker.getNom());
            b.setDatecreation(broker.getDatecreation());
            b.setDateouverturecpt(broker.getDateouverturecpt());
            b.setSituation(broker.getSituation());
            b.setAutoriteregulation(broker.getAutoriteregulation());
            b.setCouverturefiscale(broker.getCouverturefiscale());
         return brokerRepository.save(b);
        }).orElseThrow(() -> new RuntimeException("ERREUR ENREGISTREMENT BROKER"));

        PlanInvestDto planInvestDto = new PlanInvestDto();
     return    planInvestDto.fromEntity(planInvestRepository.findByNominvest(planInvest.getNominvest()).get(), brokerRepository.findByNom(broker.getNom()).get());
    }else {
        return null;
    }

    }

    @Override
    public String deletePlan(String nomPlan, String nomBroker) {
        return null;
    }
}
