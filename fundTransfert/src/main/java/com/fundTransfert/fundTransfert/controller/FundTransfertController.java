package com.fundTransfert.fundTransfert.controller;

import com.fundTransfert.fundTransfert.dto.BankResponse;
import com.fundTransfert.fundTransfert.dto.CreatingFundTransfertdto;
import com.fundTransfert.fundTransfert.service.FundTransfertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fund-transfert")
public class FundTransfertController {

    @Autowired
    private FundTransfertService fundTransfertService;

    @PostMapping("/transaction")
    public BankResponse transaction(@RequestBody CreatingFundTransfertdto request)
    {
        return this.fundTransfertService.transaction(request);
    }
}
