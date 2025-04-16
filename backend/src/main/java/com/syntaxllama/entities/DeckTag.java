package com.syntaxllama.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.util.Objects;
import java.util.UUID;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "deck_tags")
@IdClass(DeckTagId.class)
public class DeckTag {
    @Id
    @Column(name = "deck_id")
    private UUID deckId;

    @Id
    @Column(name = "tag_id")
    private UUID tagId;

    // Uncomment the mappings below if you need bidirectional access.
    // @ManyToOne(fetch = FetchType.LAZY)
    // @JoinColumn(name = "deck_id", insertable = false, updatable = false)
    // private Deck deck;
    //
    // @ManyToOne(fetch = FetchType.LAZY)
    // @JoinColumn(name = "tag_id", insertable = false, updatable = false)
    // private Tag tag;

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        DeckTag deckTag = (DeckTag) o;
        return getDeckId() != null && Objects.equals(getDeckId(), deckTag.getDeckId())
                && getTagId() != null && Objects.equals(getTagId(), deckTag.getTagId());
    }

    @Override
    public final int hashCode() {
        return Objects.hash(deckId, tagId);
    }
}
