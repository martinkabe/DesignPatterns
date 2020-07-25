package com.codewithmartin.Interfaces;

public class MainTrigger {
    public static void main(String[] args) {
        System.out.println(getCalculator(new Calculator2020()));
    }

    public static float getCalculator(TaxCalculator calculator) {
        return calculator.calculateTax();
    }
}
