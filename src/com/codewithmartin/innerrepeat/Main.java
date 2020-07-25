package com.codewithmartin.innerrepeat;

public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer("Martin");
        Outer.Inner o = outer.outerMethod();
        o.innerMethod();
    }
}
