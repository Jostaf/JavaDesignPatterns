package ru.edu.patterns.chain;

public class AgeValidationHandler extends Handler {
    @Override
    protected boolean check(UserData data) {
        return data != null && data.age() >= 16;
    }
}