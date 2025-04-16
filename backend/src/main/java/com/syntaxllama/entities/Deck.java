package com.syntaxllama.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.time.Instant;
import java.util.Objects;
import java.util.UUID;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "decks")
public class Deck {
    @Id
    @GeneratedValue
    private UUID id;

    // Many decks belong to one owner (user).
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id", nullable = false)
    @ToString.Exclude
    private User owner;

    private String title;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(name = "is_public")
    private boolean isPublic;

    @Column(name = "created_at")
    private Instant createdAt;

    @Column(name = "updated_at")
    private Instant updatedAt;

    // For deck clone/copy. If deck is cloned then clonedFrom refers to the original deck.
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cloned_from")
    @ToString.Exclude
    private Deck clonedFrom; // Note: This is a self-referencing relation. It is unidirectional here.

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        Deck deck = (Deck) o;
        return getId() != null && Objects.equals(getId(), deck.getId());
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }
}