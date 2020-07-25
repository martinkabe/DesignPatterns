package com.codewithmartin.memento.exercise;

import java.util.ArrayDeque;
import java.util.Deque;

public class DocumentHistory {
    private Deque<DocumentMemo> documents = new ArrayDeque<DocumentMemo>();

    public void push(DocumentMemo document) {
        documents.add(document);
    }

    public DocumentMemo pop() {
        DocumentMemo lastDocument = documents.getLast();
        documents.remove(lastDocument);
        return lastDocument;
    }
}
