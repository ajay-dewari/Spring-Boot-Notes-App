package me.ajay.notes.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Note {
    private final UUID id;
    private final String title;
    private final String description;

    public Note(
            @JsonProperty("id") UUID id,
            @JsonProperty("title") String title,
            @JsonProperty("description") String description
    ) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
