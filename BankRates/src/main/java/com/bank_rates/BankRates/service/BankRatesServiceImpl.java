package com.bank_rates.BankRates.service;

import com.bank_rates.BankRates.model.CrossRate;
import org.springframework.stereotype.Service;

@Service
public class BankRatesServiceImpl implements BankRatesService{

    @Override
    public CrossRate calculateBankRate(CrossRate crossRate) {

        if(crossRate.getFromCcy().equals(crossRate.getToCcy()))
        {
            crossRate.setCrossRate(1);
            return crossRate;
        }
        return crossRate;
    }
}
