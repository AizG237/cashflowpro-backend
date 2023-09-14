package com.cashflowpro.cashflowpro.dto;

import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Builder
@Data
public class BrokerDto {
    private long id_broker;

    private String nom;

    private String situation;

    private String autoriteregulation;

    private String couverturefiscale;

    private Date datecreation;

    private Date dateouverturecpt;
}
