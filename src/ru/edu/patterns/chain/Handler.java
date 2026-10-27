package ru.edu.patterns.chain;

public abstract class Handler {
    private Handler next;

    public Handler setNext(Handler next) {
        this.next = next;
        return next;
    }

    public boolean handle(UserData data) {
        if (!check(data)) {
            return false;
        }
        return next == null || next.handle(data);
    }

    protected abstract boolean check(UserData data);
}