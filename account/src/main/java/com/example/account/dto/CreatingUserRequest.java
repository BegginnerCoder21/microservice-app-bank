package com.example.account.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CreatingUserRequest {

    private String accountType;
    private String accountName;
    private String address;
}
