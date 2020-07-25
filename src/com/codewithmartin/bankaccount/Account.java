package com.codewithmartin.bankaccount;

public class Account {
    private float balance;

    public void deposit(float amount) {
        this.balance += amount;
    }

    public void withdraw(float amount) {
        if (amount > 0)
            this.balance -= amount;
    }

    public float getBalance() {
        return this.balance;
    }
}
