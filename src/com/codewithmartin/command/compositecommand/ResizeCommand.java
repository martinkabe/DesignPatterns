package com.codewithmartin.command.compositecommand;

import com.codewithmartin.command.fx.Command;

public class ResizeCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Resize");
    }
}
