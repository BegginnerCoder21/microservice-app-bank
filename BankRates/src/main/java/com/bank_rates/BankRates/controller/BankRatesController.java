package com.bank_rates.BankRates.controller;

import com.bank_rates.BankRates.model.CrossRate;
import com.bank_rates.BankRates.service.BankRatesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("bank-rates")
public class BankRatesController {


    @Autowired
    private BankRatesService bankRatesService;

    @PostMapping("/cross-rates")
    public CrossRate calculateBankRate(@RequestBody CrossRate crossRate)
    {
        return this.bankRatesService.calculateBankRate(crossRate);
    }
}
