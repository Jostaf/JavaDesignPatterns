package ru.edu.patterns.proxy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class RealFileReader implements FileReader {
    @Override
    public String read(Path path) throws IOException {
        return Files.readString(path);
    }
}