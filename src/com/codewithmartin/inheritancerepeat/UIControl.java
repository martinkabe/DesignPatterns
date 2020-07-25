package com.codewithmartin.inheritancerepeat;

public abstract class UIControl {
    public void enable() {
        System.out.println("UIControl Enabled.");
    }

    public abstract void draw();
}
