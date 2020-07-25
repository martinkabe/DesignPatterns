package com.codewithmartin.command.editor;

public interface UndoableCommand extends Command {
    void unexecute();
}
