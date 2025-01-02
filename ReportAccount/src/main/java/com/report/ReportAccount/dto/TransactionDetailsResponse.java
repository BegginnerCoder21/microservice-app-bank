package com.report.ReportAccount.dto;

import com.report.ReportAccount.model.Account;
import com.report.ReportAccount.model.FundTransfer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TransactionDetailsResponse {

    Account account;
    List<FundTransfer> fundTransfer;
}
