package com.codewithmartin.command.compositecommand;

import com.codewithmartin.command.fx.Command;

import java.util.ArrayList;
import java.util.List;

public class CompositeCommand implements Command {
    private List<Command> commands = new ArrayList<Command>();

    public void add(Command command) {
        commands.add(command);
    }

    @Override
    public void execute() {
        for (Command command : commands)
            command.execute();
    }
}
