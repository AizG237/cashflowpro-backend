package com.cashflowpro.cashflowpro.cfpController;

import com.cashflowpro.cashflowpro.modele.Wallet;
import com.cashflowpro.cashflowpro.service.WalletServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/wallet")
public class WalletController {
    private final WalletServiceImpl WalletService;

    @PostMapping("/add")
    public void ajouterWallet(@RequestBody Wallet Wallet){
        WalletService.addWallet(Wallet);
    }

    //read
    @GetMapping("/get/{id}")
    public Wallet trouverWallet(@PathVariable long id){

        return WalletService.getWallet(id);
    }

    //readAll
    @GetMapping("/get/all")
    public List<Wallet> trouverAllWallet(){
        return WalletService.getAllWallet();
    }
    //update
    @PutMapping("/update/{id}")
    public Wallet updateWallet(@PathVariable long id, @RequestBody Wallet Wallet){
        return WalletService.updateWallet(id,Wallet);
    }
    //delete
    @DeleteMapping("/delete/{id}")
    public String supprimerWallet(@PathVariable long id){
        return WalletService.deleteWallet(id);
    }
}
