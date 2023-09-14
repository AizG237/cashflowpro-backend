package com.cashflowpro.cashflowpro.dto;

import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Builder
@Data
public class EpargneDto {
    private long id_pe;

    private Date datesouscription;

    private int duree;

    private int montantmensuel;
}
