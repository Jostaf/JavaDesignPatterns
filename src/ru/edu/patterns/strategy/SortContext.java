package ru.edu.patterns.strategy;

import java.util.List;

public class SortContext {
    private SortStrategy strategy;

    public SortContext(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public List<Integer> sort(List<Integer> numbers) {
        return strategy.sort(numbers);
    }
}