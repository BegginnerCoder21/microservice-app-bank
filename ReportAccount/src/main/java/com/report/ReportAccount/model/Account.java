package com.report.ReportAccount.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {

    private int id;
    private String accountNumber;
    private String accountType;
    private String accountName;
    private BigDecimal accountBalance;
    private String address;

}
