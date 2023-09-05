package com.cashflowpro.cashflowpro.service;

import com.cashflowpro.cashflowpro.modele.Paypal;
import com.cashflowpro.cashflowpro.repository.PaypalRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PaypalService implements PaypalServiceImpl{
    private final PaypalRepository paypalRepository;
    @Override
    public Paypal addPaypal(Paypal p) {
        return paypalRepository.save(p);
    }

    @Override
    public Paypal getPaypal(long id) {
        return paypalRepository.findById(id).orElseThrow(()-> new RuntimeException("Compte paypal inexistant ou non lié à votre compte Cashflow Pro"));
    }

    @Override
    public List<Paypal> getAllPaypal() {
        return paypalRepository.findAll();
    }

    @Override
    public Paypal updatePaypal(long id, Paypal p) {
        return paypalRepository.findById(id).map(pay->{
            pay.setEmail(p.getEmail());
            pay.setPayscreation(p.getPayscreation());
            return paypalRepository.save(pay);
        }).orElseThrow(()-> new RuntimeException("Erreur de mise à jour des information du compte Paypal"));
    }

    @Override
    public String deletePaypal(long id) {
       paypalRepository.deleteById(id);
       return "Compte paypal supprimé de la plateforme";
    }
}
