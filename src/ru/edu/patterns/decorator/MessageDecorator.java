package ru.edu.patterns.decorator;

public abstract class MessageDecorator implements Message {
    protected final Message wrapped;

    protected MessageDecorator(Message wrapped) {
        this.wrapped = wrapped;
    }
}