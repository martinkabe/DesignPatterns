package com.codewithmartin.command.compositecommand;

import com.codewithmartin.command.fx.Command;

public class BlackAndWhiteCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Black and white");
    }
}
