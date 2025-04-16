package com.syntaxllama.repositories;

import com.syntaxllama.entities.Deck;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DeckRepository extends JpaRepository<Deck, UUID> {
}
