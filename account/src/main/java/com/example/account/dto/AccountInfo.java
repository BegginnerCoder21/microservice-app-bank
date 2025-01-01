package com.example.account.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class AccountInfo {

    private String accountNumber;
    private String accountType;
    private String accountName;
    private BigDecimal accountBalance;
    private String address;
}
