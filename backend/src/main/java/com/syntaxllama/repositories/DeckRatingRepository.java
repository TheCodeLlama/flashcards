package com.syntaxllama.repositories;

import com.syntaxllama.entities.DeckRating;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DeckRatingRepository extends JpaRepository<DeckRating, UUID> {
}
