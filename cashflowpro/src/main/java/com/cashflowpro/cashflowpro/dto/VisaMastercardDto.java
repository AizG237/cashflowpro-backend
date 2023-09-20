package com.cashflowpro.cashflowpro.dto;

import com.cashflowpro.cashflowpro.modele.VisaMastercard;
import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@Data
public class VisaMastercardDto {
    private long id_visamastercard;
    private Date date_creation;
    private int numerocarte;
    private int ccv;

    public VisaMastercardDto fromEntity(VisaMastercard visaMastercard){
        if (visaMastercard == null){
            return null;
        }
        VisaMastercardDto visaMastercardDto = new VisaMastercardDto();
        visaMastercardDto.setId_visamastercard(visaMastercardDto.getId_visamastercard());
        visaMastercardDto.setCcv(visaMastercardDto.getCcv());
        visaMastercardDto.setNumerocarte(visaMastercard.getNumerocarte());
        visaMastercardDto.setDate_creation(visaMastercard.getDate_creation());
        return visaMastercardDto;
    }

    public VisaMastercard toiEntity(VisaMastercardDto visaMastercardDto){
        if (visaMastercardDto == null){
            return null;
        }
        VisaMastercard visaMastercard = new VisaMastercard();
        visaMastercard.setId_visamastercard(visaMastercardDto.getId_visamastercard());
        visaMastercard.setCcv(visaMastercardDto.getCcv());
        visaMastercard.setNumerocarte(visaMastercardDto.getNumerocarte());
        visaMastercard.setDate_creation(visaMastercardDto.getDate_creation());
        return visaMastercard;
    }
}
