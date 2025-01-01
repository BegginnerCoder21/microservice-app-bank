package com.example.account.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class BankResponse {

    private String responseCode;
    private String responseMessage;
    private AccountInfo accountInfo;
}
