package com.report.ReportAccount.service;

import com.report.ReportAccount.dto.TransactionDetailsResponse;

public interface ReportAccountService {

    public TransactionDetailsResponse getTransactionDetails(String accountNumber);
}
