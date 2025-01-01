package com.example.account.utils;

import java.time.Year;

public class AccountUtils {

    public static final String REGISTERED_USER_SUCCESS_CODE = "001";
    public static final String REGISTERED_USER_SUCCESS_MESSAGE = "Votre compte a été crée avec succès";

    public static String generateAccountNumber() {

        Year currentYear = Year.now();
        int min = 100000;
        int max = 999999;

        int randomNumber = (int) Math.floor(Math.random() * (max - min + 1) + min);

        String year = String.valueOf(currentYear);
        String randNumber = String.valueOf(randomNumber);

        StringBuilder accountNumber = new StringBuilder();

        return accountNumber.append(year).append(randNumber).toString();
    }
}
