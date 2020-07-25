package com.codewithmartin.memento.exercise;

public class Document {
    private String content;
    private String fontName;
    private int fontSize;

    public DocumentMemo createDocument() {
        return new DocumentMemo(content, fontName, fontSize);
    }

    public void restoreDocument(DocumentMemo document) {
        content = document.getContent();
        fontName = document.getFontName();
        fontSize = document.getFontSize();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    @Override
    public String toString() {
        return "Document{" +
                "content='" + content + '\'' +
                ", fontName='" + fontName + '\'' +
                ", fontSize=" + fontSize +
                '}';
    }
}