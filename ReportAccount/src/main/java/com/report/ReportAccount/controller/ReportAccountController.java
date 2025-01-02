package com.report.ReportAccount.controller;

import com.report.ReportAccount.dto.TransactionDetailsResponse;
import com.report.ReportAccount.service.ReportAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account-report")
public class ReportAccountController {

    @Autowired
    private ReportAccountService reportAccountService;

    @GetMapping("{accountNumber}")
    public TransactionDetailsResponse transactionDetails(@PathVariable String accountNumber)
    {
        return this.reportAccountService.getTransactionDetails(accountNumber);
    }
}
