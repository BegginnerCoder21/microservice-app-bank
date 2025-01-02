package com.report.ReportAccount.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FundTransfer {

    private String id;
    private String accountFrom;
    private String accountTo;
    private String beneName;
    private BigDecimal amount;
    private String ifsc;
}
