package com.cashflowpro.cashflowpro.dto;

import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
@Builder
@Data
public class VirementsalaireDto {
    private long id_virementsalaire;

    private String motif;

    private String mois;

    private int annee;
    private Date datevirement;
}
