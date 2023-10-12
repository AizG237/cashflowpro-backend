package com.cashflowpro.cashflowpro.cfpController;

import com.cashflowpro.cashflowpro.modele.Transaction;
import com.cashflowpro.cashflowpro.service.TransactionServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transaction")
@AllArgsConstructor
@CrossOrigin("*")
public class TransactionController {
    private final TransactionServiceImpl transaction;
    @PostMapping("/add")
    public ResponseEntity<Transaction> ajouterTransaction(@RequestBody Transaction t){
        if ( !transaction.addTransact(t).equals(null)){
        return ResponseEntity.ok(transaction.addTransact(t));
        }else {
            return ResponseEntity.status(403).body(null);
        }
    }

}
