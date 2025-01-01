package com.example.account.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Table(name = "account")
@Builder
@Data
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String accountNumber;
    private String accountType;
    private String accountName;
    private BigDecimal accountBalance;
    private String address;

}
