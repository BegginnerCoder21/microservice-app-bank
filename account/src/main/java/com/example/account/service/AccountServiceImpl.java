package com.example.account.service;

import com.example.account.dto.AccountInfo;
import com.example.account.dto.BankResponse;
import com.example.account.dto.CreatingUserRequest;
import com.example.account.entity.Account;
import com.example.account.repository.AccountRepository;
import com.example.account.utils.AccountUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public BankResponse createAccount(CreatingUserRequest request) {

        String accountNumber = AccountUtils.generateAccountNumber();
        Account newAccount = Account.builder()
                .accountNumber(accountNumber)
                .accountBalance(BigDecimal.ZERO)
                .accountName(request.getAccountName())
                .address(request.getAddress())
                .accountType(request.getAccountType())
                .build();

        this.accountRepository.save(newAccount);

        return BankResponse.builder()
                .responseCode(AccountUtils.REGISTERED_USER_SUCCESS_CODE)
                .responseMessage(AccountUtils.REGISTERED_USER_SUCCESS_MESSAGE)
                .accountInfo(AccountInfo.builder()
                        .accountNumber(accountNumber)
                        .accountType(request.getAccountType())
                        .accountBalance(BigDecimal.ZERO)
                        .accountName(request.getAccountName())
                        .address(request.getAddress())
                        .build())
                .build();
    }

    @Override
    public List<Account> allAccount() {

        return this.accountRepository.findAll();
    }
}
