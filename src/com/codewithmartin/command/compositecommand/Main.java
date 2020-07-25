package com.codewithmartin.command.compositecommand;

public class Main {
    public static void main(String[] args) {
        CompositeCommand composite = new CompositeCommand();
        composite.add(new ResizeCommand());
        composite.add(new BlackAndWhiteCommand());
        composite.execute();
        composite.execute();
    }
}
