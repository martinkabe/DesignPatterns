package com.codewithmartin.inheritancerepeat;

public class CheckBox extends UIControl {
    @Override
    public void enable() {
        System.out.println("CheckBox enabled.");
    }

    @Override
    public void draw() {
        System.out.println("Drawing a CheckBox ...");
    }
}
