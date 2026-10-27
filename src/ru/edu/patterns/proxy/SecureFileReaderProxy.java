package ru.edu.patterns.proxy;

import java.io.IOException;
import java.nio.file.Path;

public class SecureFileReaderProxy implements FileReader {
    private final FileReader realReader;

    public SecureFileReaderProxy(FileReader realReader) {
        this.realReader = realReader;
    }

    @Override
    public String read(Path path) throws IOException {
        if (path == null || path.getFileName() == null || !path.getFileName().toString().endsWith(".txt")) {
            throw new SecurityException("Разрешены только файлы .txt");
        }

        return realReader.read(path);
    }
}