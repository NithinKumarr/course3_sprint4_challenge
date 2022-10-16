package com.bank;

public abstract class BankAccount {
    long accountNumber;
    String accountHolderName;
    String accountOpeningDate;
    String modeOfOperations;
    String internetBanking;
    long totalBalance;
    int availableBalance;
    float rateOfInterest;

    abstract void showAccountBalance();
}
