package com.fundTransfert.fundTransfert.service;

import com.fundTransfert.fundTransfert.dto.BankResponse;
import com.fundTransfert.fundTransfert.dto.CreatingFundTransfertdto;
import com.fundTransfert.fundTransfert.entity.FundTransfert;

import java.util.List;

public interface FundTransfertService {

    public BankResponse transaction(CreatingFundTransfertdto request);
    public List<FundTransfert> allTransaction();
    public List<FundTransfert> getAccountFrom(String accountNumber);
}
