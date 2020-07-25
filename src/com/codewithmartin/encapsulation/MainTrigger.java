package com.codewithmartin.encapsulation;

public class MainTrigger {
    public static void main(String[] args) {
        Account account = new Account();
        account.setBalance(200);
        account.setBalance(100);
        account.withdraw(400);
        account.setBalance(500);
    }
}
