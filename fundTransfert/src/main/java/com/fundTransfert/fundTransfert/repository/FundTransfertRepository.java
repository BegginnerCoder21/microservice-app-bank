package com.fundTransfert.fundTransfert.repository;

import com.fundTransfert.fundTransfert.entity.FundTransfert;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FundTransfertRepository extends JpaRepository<FundTransfert, String> {

    boolean existsByAccountFrom(String accountNumber);
    List<FundTransfert> findByAccountFrom(String accountNumber);
}
