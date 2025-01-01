package com.fundTransfert.fundTransfert.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CreatingFundTransfertdto {

    private String accountFrom;
    private String accountTo;
    private String beneName;
    private BigDecimal amount;
    private String ifsc;
}
