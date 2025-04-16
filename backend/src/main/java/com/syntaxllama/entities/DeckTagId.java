package com.syntaxllama.entities;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public class DeckTagId implements Serializable {

    private UUID deckId;
    private UUID tagId;

    public DeckTagId() {}

    public DeckTagId(UUID deckId, UUID tagId) {
        this.deckId = deckId;
        this.tagId = tagId;
    }

    public UUID getDeckId() {
        return deckId;
    }

    public void setDeckId(UUID deckId) {
        this.deckId = deckId;
    }

    public UUID getTagId() {
        return tagId;
    }

    public void setTagId(UUID tagId) {
        this.tagId = tagId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DeckTagId)) return false;
        DeckTagId that = (DeckTagId) o;
        return Objects.equals(deckId, that.deckId) &&
                Objects.equals(tagId, that.tagId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deckId, tagId);
    }
}
