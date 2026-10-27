package ru.edu.patterns.adapter;

import java.util.Arrays;
import java.util.List;

public class LegacyContactAdapter implements ContactProvider {
    private final LegacyContactSource source;

    public LegacyContactAdapter(LegacyContactSource source) {
        this.source = source;

    }

    @Override
    public List<String> getContacts() {
        return Arrays.asList(source.fetchLegacyContactRecords());
    }
}