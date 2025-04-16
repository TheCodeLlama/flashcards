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
@Table(name = "deck_global_stats")
public class DeckGlobalStat {
    @Id
    @Column(name = "deck_id")
    private UUID deckId;  // Primary key and also foreign key to Deck

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    @JoinColumn(name = "deck_id")
    @ToString.Exclude
    private Deck deck;

    @Column(name = "total_answers")
    private int totalAnswers;

    @Column(name = "total_correct")
    private int totalCorrect;

    @Column(name = "total_incorrect")
    private int totalIncorrect;

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        DeckGlobalStat that = (DeckGlobalStat) o;
        return getDeckId() != null && Objects.equals(getDeckId(), that.getDeckId());
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }
}
