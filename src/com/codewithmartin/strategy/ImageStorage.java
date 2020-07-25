package com.codewithmartin.strategy;

public class ImageStorage {
    private String fileName;

    public ImageStorage(String fileName) {
        this.fileName = fileName;
    }

    public void store(Compressor compressor, Filter filter) {
        compressor.compress();
        filter.apply();
    }

    public String getFileName() {
        return fileName;
    }
}
