package com.report.ReportAccount.service;

import com.report.ReportAccount.dto.TransactionDetailsResponse;
import com.report.ReportAccount.model.Account;
import com.report.ReportAccount.model.FundTransfer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportAccountServiceImpl implements ReportAccountService{

    @Autowired
    private RestTemplateBuilder restTemplateBuilder;

    @Override
    public TransactionDetailsResponse getTransactionDetails(String accountNumber) {

        Account account = restTemplateBuilder.build().getForObject("http://localhost:9090/account/get-account-number/" + accountNumber, Account.class);

        List<FundTransfer> fundTransfer = restTemplateBuilder.build().getForObject("http://localhost:9091/fund-transfert/get-account-from/" + accountNumber, List.class);


        return TransactionDetailsResponse.builder()
                .account(account)
                .fundTransfer(fundTransfer)
                .build();
    }
}
