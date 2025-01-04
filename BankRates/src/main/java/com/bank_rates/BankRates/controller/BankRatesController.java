package com.bank_rates.BankRates.controller;

import com.bank_rates.BankRates.model.CrossRate;
import com.bank_rates.BankRates.service.BankRatesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("bank-rates")
public class BankRatesController {


    @Autowired
    private BankRatesService bankRatesService;

    @GetMapping("/cross-rates")
    public CrossRate calculateBankRate(@RequestBody CrossRate crossRate)
    {
        return this.bankRatesService.calculateBankRate(crossRate);
    }
}
