package com.designpattern.structural.facad;

public class Client {

    public static void main(String[] args) {
        AccountFactory accountFactory = new AccountFactory();
        IBankingService bankingService = new BankingService(accountFactory.getAccountByType(AccountType.SAVING));
        Account account = bankingService.account();
        System.out.println(account.getAccountType().name());

        bankingService = new BankingService(accountFactory.getAccountByType(AccountType.PF));
        account = bankingService.account();
        System.out.println(account.getAccountType().name());

        bankingService = new BankingService(accountFactory.getAccountByType(AccountType.CREDIT));
        account = bankingService.account();
        System.out.println(account.getAccountType().name());
    }
}
