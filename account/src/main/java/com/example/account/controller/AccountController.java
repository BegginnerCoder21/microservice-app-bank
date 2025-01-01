package com.example.account.controller;

import com.example.account.dto.BankResponse;
import com.example.account.dto.CreatingUserRequest;
import com.example.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
