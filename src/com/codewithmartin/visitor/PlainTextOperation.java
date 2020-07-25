package com.codewithmartin.visitor;

public class PlainTextOperation implements Operation {
    @Override
    public void apply(HeadingNode heading) {
        System.out.println("plain-text-heading");
    }

    @Override
    public void apply(AnchorNode anchor) {
        System.out.println("plain-text-anchor");
    }
}
