package com.designpattern.structural.facad;

public class CreditAccount implements IAccount{

    @Override
    public Account account() {
        Account account = new Account();
        double random = Math.random();
        account.setAccountNumber((int) random);
        account.setAccountType(AccountType.CREDIT);
        account.setIntrestRate(3);
        account.setTotalAmount(500);
        return account;
    }
}
