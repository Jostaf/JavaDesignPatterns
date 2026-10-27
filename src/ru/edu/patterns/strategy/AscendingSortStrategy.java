package ru.edu.patterns.strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AscendingSortStrategy implements SortStrategy {
    @Override
    public List<Integer> sort(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>(numbers);
        Collections.sort(result);
        return result;
    }
}