package com.example.account.service;

import com.example.account.dto.BankResponse;
import com.example.account.dto.CreatingUserRequest;
import com.example.account.entity.Account;
import org.springframework.stereotype.Service;

import java.util.List;


public interface AccountService {

    BankResponse createAccount(CreatingUserRequest request);
    List<Account> allAccount();
    BankResponse getForAccount(String accountNumber);
}
