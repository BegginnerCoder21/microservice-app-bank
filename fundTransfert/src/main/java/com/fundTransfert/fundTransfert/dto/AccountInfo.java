package com.fundTransfert.fundTransfert.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data
public class AccountInfo {

    private String beneName;
    private BigDecimal amount;
    private String ifsc;
}
