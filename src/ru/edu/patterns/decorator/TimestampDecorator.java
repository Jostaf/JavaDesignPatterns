package ru.edu.patterns.decorator;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimestampDecorator extends MessageDecorator {
    public TimestampDecorator(Message wrapped) {
        super(wrapped);
    }

    @Override
    public String getText() {
        String time = LocalDateTime.now().format(
                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
        );
        return "[" + time + "] " + wrapped.getText();
    }
}