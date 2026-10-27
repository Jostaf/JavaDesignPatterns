package ru.edu.patterns.decorator;

import java.util.Locale;

public class UppercaseDecorator extends MessageDecorator {
    public UppercaseDecorator(Message wrapped) {
        super(wrapped);
    }

    @Override
    public String getText() {
        return wrapped.getText().toUpperCase(Locale.ROOT);
    }
}