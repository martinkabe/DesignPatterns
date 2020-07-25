package com.codewithmartin.visitor;

public class Main {
    public static void main(String[] args) {
        HtmlDocument document = new HtmlDocument();
        document.add(new AnchorNode());
        document.add(new HeadingNode());
        document.execute(new HighlightOperation());
        document.execute(new PlainTextOperation());
    }
}
