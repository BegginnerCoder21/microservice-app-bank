package com.example.account.service;

import com.example.account.dto.BankResponse;
import com.example.account.dto.CreatingUserRequest;
import org.springframework.stereotype.Service;


public interface AccountService {

    BankResponse createAccount(CreatingUserRequest request);
}
