package com.codewithmartin.state.abuse.tools;

public class Main {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        canvas.setTool(new SelectionTool());
        canvas.mouseUp();
    }
}
