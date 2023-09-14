package com.cashflowpro.cashflowpro.dto;

import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class MtnmomoDto {
    private long id_momo;

    private String nomoperateur;

    private int indicatifpays;

    private long numero;

    private String nomvalidation;
}
