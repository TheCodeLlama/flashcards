package com.syntaxllama.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
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
    private Deck deck;

    @Column(name = "total_answers")
    private int totalAnswers;

    @Column(name = "total_correct")
    private int totalCorrect;

    @Column(name = "total_incorrect")
    private int totalIncorrect;
}
