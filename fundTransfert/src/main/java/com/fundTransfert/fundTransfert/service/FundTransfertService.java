package com.fundTransfert.fundTransfert.service;

import com.fundTransfert.fundTransfert.dto.BankResponse;
import com.fundTransfert.fundTransfert.dto.CreatingFundTransfertdto;

public interface FundTransfertService {

    public BankResponse transaction(CreatingFundTransfertdto request);
}
