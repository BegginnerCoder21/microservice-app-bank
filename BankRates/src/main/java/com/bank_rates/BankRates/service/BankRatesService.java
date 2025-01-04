package com.bank_rates.BankRates.service;

import com.bank_rates.BankRates.model.CrossRate;

public interface BankRatesService {

    public CrossRate calculateBankRate(CrossRate crossRate);
}
