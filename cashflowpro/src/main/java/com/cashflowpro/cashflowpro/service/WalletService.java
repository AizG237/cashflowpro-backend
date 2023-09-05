package com.cashflowpro.cashflowpro.service;

import com.cashflowpro.cashflowpro.modele.Wallet;
import com.cashflowpro.cashflowpro.repository.WalletRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class WalletService implements WalletServiceImpl{
    private final WalletRepository WalletRepository;
    @Override
    public Wallet addWallet(Wallet p) {
        return WalletRepository.save(p);
    }

    @Override
    public Wallet getWallet(long id) {
        return WalletRepository.findById(id).orElseThrow(()-> new RuntimeException("Compte Wallet inexistant ou non lié à votre compte Cashflow Pro"));
    }

    @Override
    public List<Wallet> getAllWallet() {
        return WalletRepository.findAll();
    }

    @Override
    public Wallet updateWallet(long id, Wallet p) {
        return WalletRepository.findById(id).map(pay->{
           pay.setDevise(p.getDevise());
           pay.setSociete(p.getSociete());
            return WalletRepository.save(pay);
        }).orElseThrow(()-> new RuntimeException("Erreur de mise à jour des information du compte Wallet"));
    }

    @Override
    public String deleteWallet(long id) {
       WalletRepository.deleteById(id);
       return "Compte Wallet supprimé de la plateforme";
    }
}
