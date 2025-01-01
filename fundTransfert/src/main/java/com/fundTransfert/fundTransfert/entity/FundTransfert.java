package com.fundTransfert.fundTransfert.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "transaction")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FundTransfert {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String accountFrom;
    private String accountTo;
    private String beneName;
    private BigDecimal amount;
    private String ifsc;
}
