package ru.edu.patterns.decorator;

public class BasicMessage implements Message {
    private final String text;

    public BasicMessage(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return text;
    }
}