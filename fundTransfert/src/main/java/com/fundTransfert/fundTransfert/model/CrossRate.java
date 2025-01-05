package com.fundTransfert.fundTransfert.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CrossRate {

    private String fromCcy;
    private String toCcy;
    private double crossRate;
}
