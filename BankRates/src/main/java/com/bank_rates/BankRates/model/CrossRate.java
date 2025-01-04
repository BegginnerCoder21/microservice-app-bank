package com.bank_rates.BankRates.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CrossRate {

    private String fromCcy;
    private String toCcy;
    private double crossRate;
}
