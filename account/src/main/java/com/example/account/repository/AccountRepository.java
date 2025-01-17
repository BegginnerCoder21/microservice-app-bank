package com.example.account.repository;

import com.example.account.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, String> {

    Account findByAccountNumber(String accountNumber);
    boolean existsByAccountNumber(String accountNumber);

}
