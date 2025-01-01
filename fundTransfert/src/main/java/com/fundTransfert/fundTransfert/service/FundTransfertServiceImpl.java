package com.fundTransfert.fundTransfert.service;

import com.fundTransfert.fundTransfert.dto.AccountInfo;
import com.fundTransfert.fundTransfert.dto.BankResponse;
import com.fundTransfert.fundTransfert.dto.CreatingFundTransfertdto;
import com.fundTransfert.fundTransfert.entity.FundTransfert;
import com.fundTransfert.fundTransfert.repository.FundTransfertRepository;
import com.fundTransfert.fundTransfert.utils.FundTransfertUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FundTransfertServiceImpl implements FundTransfertService{

    @Autowired
    private FundTransfertRepository fundTransfertRepository;

    @Override
    public BankResponse transaction(CreatingFundTransfertdto request) {

        FundTransfert newFundTransfert = FundTransfert.builder()
                .amount(request.getAmount())
                .ifsc(request.getIfsc())
                .accountFrom(request.getAccountFrom())
                .accountTo(request.getAccountTo())
                .beneName(request.getBeneName())
                .build();

        FundTransfert fundTransfert = this.fundTransfertRepository.save(newFundTransfert);

        return BankResponse.builder()
                .responseCode(FundTransfertUtils.CREATING_FUND_TRANSFERT_SUCCESS_CODE)
                .responseMessage(FundTransfertUtils.CREATING_FUND_TRANSFERT_SUCCESS_MESSAGE)
                .accountInfo(AccountInfo.builder()
                        .amount(fundTransfert.getAmount())
                        .beneName(fundTransfert.getBeneName())
                        .ifsc(fundTransfert.getIfsc())
                        .build())
                .build();
    }

    @Override
    public List<FundTransfert> allTransaction() {

        return this.fundTransfertRepository.findAll();
    }
}
