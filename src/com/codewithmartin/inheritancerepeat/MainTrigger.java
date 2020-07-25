package com.codewithmartin.inheritancerepeat;

public class MainTrigger {
    public static void main(String[] args) {
        drawUIControl(new TextBox());
        drawUIControl(new CheckBox());
    }

    public static void drawUIControl(UIControl control) {
        control.enable();
        control.draw();
    }
}
