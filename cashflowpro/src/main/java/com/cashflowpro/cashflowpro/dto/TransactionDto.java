package com.cashflowpro.cashflowpro.dto;

import com.cashflowpro.cashflowpro.modele.Transaction;
import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@Data
public class TransactionDto {
    private long  id_transact;
    private Date date_init;
    private Date date_effect;
    private String motif;
    private boolean type_cashflow;

    public TransactionDto fromEntity(Transaction transaction){
        if (transaction == null){
            return null;
        }
        TransactionDto transactionDto = new TransactionDto();
        transactionDto.setId_transact(transaction.getId_transact());
        transactionDto.setMotif(transaction.getMotif());
        transactionDto.setDate_effect(transaction.getDate_effect());
        transactionDto.setDate_init(transaction.getDate_init());
        transactionDto.setType_cashflow(transaction.isType_cashflow());
        return transactionDto;
    }

    public Transaction toEntity(TransactionDto transactionDto){
        if (transactionDto == null){
            return null;
        }
        Transaction transaction = new Transaction();
        transaction.setId_transact(transactionDto.getId_transact());
        transaction.setMotif(transactionDto.getMotif());
        transaction.setDate_effect(transactionDto.getDate_effect());
        transaction.setDate_init(transactionDto.getDate_init());
        transaction.setType_cashflow(transactionDto.isType_cashflow());
        return transaction;
    }
}
