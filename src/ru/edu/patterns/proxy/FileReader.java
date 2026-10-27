package ru.edu.patterns.proxy;

import java.io.IOException;
import java.nio.file.Path;

public interface FileReader {
    String read(Path path) throws IOException;
}