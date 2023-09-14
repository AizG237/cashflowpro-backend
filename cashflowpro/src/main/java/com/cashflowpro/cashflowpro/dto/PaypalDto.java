package com.cashflowpro.cashflowpro.dto;

import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class PaypalDto {
    private long id_paypal;

    private String email;

    private String payscreation;
}
