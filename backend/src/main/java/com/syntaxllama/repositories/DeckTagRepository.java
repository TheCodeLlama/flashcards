package com.syntaxllama.repositories;

import com.syntaxllama.entities.DeckTag;
import com.syntaxllama.entities.DeckTagId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeckTagRepository extends JpaRepository<DeckTag, DeckTagId> {
}
