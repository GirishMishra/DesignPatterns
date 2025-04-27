package com.designpattern.structural.facad;

public class AccountFactory {

    IAccount getAccountByType(AccountType accountType) {
        switch (accountType) {
            case PF -> {
                return new PFAccount();
            }
            case CREDIT -> {
                return new CreditAccount();
            }
            case SAVING -> {
                return new SavingAccount();
            }
            default -> new SavingAccount();
        }
        return new SavingAccount();
    }
}
