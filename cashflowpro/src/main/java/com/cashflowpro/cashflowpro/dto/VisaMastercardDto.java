package com.cashflowpro.cashflowpro.dto;

import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Builder
@Data
public class VisaMastercardDto {
    private long id_visamastercard;


    private Date date_creation;

    private int numerocarte;

    private int ccv;
}
