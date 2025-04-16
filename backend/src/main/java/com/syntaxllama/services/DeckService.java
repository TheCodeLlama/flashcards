package com.syntaxllama.services;

import com.syntaxllama.entities.Deck;
import com.syntaxllama.entities.User;
import com.syntaxllama.repositories.DeckRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class DeckService {
    private final DeckRepository deckRepository;

    public Deck createDeck(User owner, String title, String description, boolean isPublic) {
        Deck deck = Deck.builder()
                .owner(owner)
                .title(title)
                .description(description)
                .isPublic(isPublic)
                .createdAt(Instant.now())
                .updatedAt(Instant.now())
                .build();
        return deckRepository.save(deck);
    }

    public Optional<Deck> findDeckById(UUID deckId) {
        return deckRepository.findById(deckId);
    }

    // TODO: Methods for update, delete, cloning etc.
}
