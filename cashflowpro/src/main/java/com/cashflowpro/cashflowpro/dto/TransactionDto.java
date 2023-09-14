package com.cashflowpro.cashflowpro.dto;

import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Builder
@Data
public class TransactionDto {
    private long  id_transact;

    private Date date_init;

    private Date date_effect;

    private String motif;

    private boolean type_cashflow;
}
