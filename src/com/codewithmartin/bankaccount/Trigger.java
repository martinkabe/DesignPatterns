package com.codewithmartin.bankaccount;

public class Trigger {
    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(100);
        account.withdraw(40);
        System.out.println(account.getBalance());
    }
}
