package com.example.account.controller;

import com.example.account.dto.BankResponse;
import com.example.account.dto.CreatingUserRequest;
import com.example.account.entity.Account;
import com.example.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping("/register")
    public BankResponse createAccount(@RequestBody CreatingUserRequest request)
    {
        return this.accountService.createAccount(request);
    }

    @GetMapping("/all-accounts")
    public List<Account> allAccount()
    {
        return this.accountService.allAccount();
    }

    @GetMapping("/get-account-number/{accountNumber}")
    public BankResponse getAccountNumber(@PathVariable String accountNumber)
    {
        return this.accountService.getForAccount(accountNumber);
    }
}
