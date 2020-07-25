package com.codewithmartin.strategy;

public class Main {
    public static void main(String[] args) {
        ImageStorage storage = new ImageStorage("Some File");
        storage.store(new JpegCompressor(), new BlackAndWhiteFilter());
    }
}
