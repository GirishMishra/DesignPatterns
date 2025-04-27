package com.designpattern.structural.facad;

public class BankingService implements IBankingService {
    IAccount iAccount;
    public BankingService(IAccount iAccount) {
         this.iAccount = iAccount;
    }
    @Override
    public Account account() {
        return iAccount.account();
    }

}
