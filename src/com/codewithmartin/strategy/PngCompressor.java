package com.codewithmartin.strategy;

public class PngCompressor implements Compressor {
    @Override
    public void compress() {
        System.out.println("Png compressor in place");
    }
}
