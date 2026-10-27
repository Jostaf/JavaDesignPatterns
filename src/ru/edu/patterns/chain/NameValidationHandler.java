package ru.edu.patterns.chain;

public class NameValidationHandler extends Handler {
    @Override
    protected boolean check(UserData data) {
        return data != null && data.name() != null && !data.name().isBlank();
    }
}