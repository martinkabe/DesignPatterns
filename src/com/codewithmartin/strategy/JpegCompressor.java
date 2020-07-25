package com.codewithmartin.strategy;

public class JpegCompressor implements Compressor {
    @Override
    public void compress() {
        System.out.println("Jpeg compressor in place");
    }
}
