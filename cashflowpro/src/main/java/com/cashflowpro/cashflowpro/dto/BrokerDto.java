package com.cashflowpro.cashflowpro.dto;

import com.cashflowpro.cashflowpro.modele.Broker;
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
    public BrokerDto fromEntity(Broker broker){
        if(broker == null){
            return null;
        }
        return BrokerDto.builder()
                .id_broker(broker.getId_broker())
                .nom(broker.getNom())
                .situation(broker.getSituation())
                .autoriteregulation(broker.getAutoriteregulation())
                .couverturefiscale(broker.getCouverturefiscale())
                .datecreation(broker.getDatecreation())
                .dateouverturecpt(broker.getDateouverturecpt())
                .build();
    }
    public Broker toEntity(BrokerDto brokerDto){
        if (brokerDto == null){
            return null;
        }
        return Broker.builder()
                .id_broker(brokerDto.id_broker)
                .autoriteregulation(brokerDto.getAutoriteregulation())
                .couverturefiscale(brokerDto.getCouverturefiscale())
                .datecreation(brokerDto.getDatecreation())
                .dateouverturecpt(brokerDto.getDateouverturecpt())
                .nom(brokerDto.getNom())
                .situation(brokerDto.getSituation())
                .build();
    }
}
