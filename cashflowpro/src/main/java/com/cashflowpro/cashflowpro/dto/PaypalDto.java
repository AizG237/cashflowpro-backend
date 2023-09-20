package com.cashflowpro.cashflowpro.dto;

import com.cashflowpro.cashflowpro.modele.Paypal;
import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class PaypalDto {
    private long id_paypal;
    private String email;
    private String payscreation;

    public PaypalDto fromEntity(Paypal paypal) {
        if (paypal == null) {
            return null;
        }
        PaypalDto paypalDto = new PaypalDto();
        paypalDto.setId_paypal(paypal.getId_paypal());
        paypalDto.setEmail(paypal.getEmail());
        paypalDto.setPayscreation(paypal.getPayscreation());
        return paypalDto;
    }

    public Paypal toEntity(PaypalDto paypalDto) {
        if (paypalDto == null) {
            return null;
        }

        Paypal paypal = new Paypal();
        paypal.setId_paypal(paypalDto.getId_paypal());
        paypal.setPayscreation(paypalDto.getPayscreation());
        paypal.setEmail(paypalDto.getEmail());
        return paypal;
    }
}
