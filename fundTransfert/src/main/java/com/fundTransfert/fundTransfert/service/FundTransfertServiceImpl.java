package com.fundTransfert.fundTransfert.service;

import com.fundTransfert.fundTransfert.dto.AccountInfo;
import com.fundTransfert.fundTransfert.dto.BankResponse;
import com.fundTransfert.fundTransfert.dto.CreatingFundTransfertdto;
import com.fundTransfert.fundTransfert.entity.FundTransfert;
import com.fundTransfert.fundTransfert.model.CrossRate;
import com.fundTransfert.fundTransfert.repository.FundTransfertRepository;
import com.fundTransfert.fundTransfert.utils.FundTransfertUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class FundTransfertServiceImpl implements FundTransfertService{

    @Autowired
    RestTemplateBuilder restTemplateBuilder;

    @Autowired
    private FundTransfertRepository fundTransfertRepository;

    @Override
    public BankResponse transaction(CreatingFundTransfertdto request) {

        CrossRate crossRate = CrossRate.builder()
                .fromCcy("EURO")
                .toCcy("X0F")
                .crossRate(550)
                .build();

        ResponseEntity<CrossRate> responseEntity = this.restTemplateBuilder.build().exchange("http://localhost:9093/bank-rates/cross-rates", HttpMethod.POST, new HttpEntity<CrossRate>(crossRate), CrossRate.class);

        System.out.println(responseEntity.getBody());
        crossRate = responseEntity.getBody();
        BigDecimal amount = request.getAmount().multiply(BigDecimal.valueOf(crossRate.getCrossRate()));

        FundTransfert newFundTransfert = FundTransfert.builder()
                .amount(amount)
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

    @Override
    public List<FundTransfert> getAccountFrom(String accountNumber) {

        boolean isFundTransferExist = this.fundTransfertRepository.existsByAccountFrom(accountNumber);

        return this.fundTransfertRepository.findByAccountFrom(accountNumber);
    }
}
