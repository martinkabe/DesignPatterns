package com.codewithmartin.encapsulation;

public class Account {
    private float balance;

    public float getBalance() {
        return balance;
    }

    public void withdraw(float amount) {
        this.balance -= amount;
        System.out.println("Withdrawn " + amount +  " from your" +
                " bank account, now you have " + getBalance());
    }

    public void setBalance(float balance) {
        if (balance > 0) {
            this.balance += balance;
            System.out.println("Added " + balance + " to your account, now you have " +
                    getBalance() + " in total.");
        } else {
            System.out.println("Negative balance not allowed.");
        }
    }
}
