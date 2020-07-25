package com.codewithmartin.inheritance;

public class Main {
    public static void main(String[] args) {
        drawUIControl(new TextBox());
        drawUIControl(new CheckBox());
    }

    public static void drawUIControl(UIControl uiControl) {
        uiControl.draw();
    }
}
