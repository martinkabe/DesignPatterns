package com.codewithmartin.state.abuse.tools;

public class SelectionTool implements Tool {
    @Override
    public void mouseUp() {
        System.out.println("Selection tool -> mouse up");
    }

    @Override
    public void mouseDown() {
        System.out.println("Selection tool -> mouse down");
    }
}
