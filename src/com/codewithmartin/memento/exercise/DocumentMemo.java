package com.codewithmartin.memento.exercise;

public class DocumentMemo {
    private String content;
    private String fontName;
    private int fontSize;

    public DocumentMemo(String content, String fontName, int fontSize) {
        this.content = content;
        this.fontName = fontName;
        this.fontSize = fontSize;
    }

    public String getContent() {
        return content;
    }

    public String getFontName() {
        return fontName;
    }

    public int getFontSize() {
        return fontSize;
    }
}
