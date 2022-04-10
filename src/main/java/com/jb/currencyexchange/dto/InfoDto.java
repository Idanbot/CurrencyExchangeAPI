package com.jb.currencyexchange.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InfoDto {
    private String fromCurrency;
    private String toCurrency;
    private double amount;
    private double result;
}
