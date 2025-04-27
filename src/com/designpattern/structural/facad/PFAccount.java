package com.designpattern.structural.facad;

public class PFAccount implements IAccount {

    @Override
    public Account account() {
        Account account = new Account();
        double random = Math.random();
        account.setAccountNumber((int) random);
        account.setAccountType(AccountType.PF);
        account.setIntrestRate(8);
        account.setTotalAmount(500);
        return account;
    }
}
