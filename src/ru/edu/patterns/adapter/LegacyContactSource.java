package ru.edu.patterns.adapter;

public class LegacyContactSource {
    public String[] fetchLegacyContactRecords() {
        return new String[]{
                "Иванов;ivan@example.com",
                "Петров;petrov@example.com"
        };
    }
}