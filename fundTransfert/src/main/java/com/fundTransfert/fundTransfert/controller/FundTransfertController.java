package com.fundTransfert.fundTransfert.controller;

import com.fundTransfert.fundTransfert.dto.BankResponse;
import com.fundTransfert.fundTransfert.dto.CreatingFundTransfertdto;
import com.fundTransfert.fundTransfert.entity.FundTransfert;
import com.fundTransfert.fundTransfert.service.FundTransfertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("allTransaction")
    public List<FundTransfert> allTransaction()
    {
        return this.fundTransfertService.allTransaction();
    }
}
