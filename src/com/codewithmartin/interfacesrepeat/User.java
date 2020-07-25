package com.codewithmartin.interfacesrepeat;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }
    public void sayName() {
        System.out.println("My name is " + this.name);
    }
}
