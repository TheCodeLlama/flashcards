package com.syntaxllama.repositories;

import com.syntaxllama.entities.FavoriteDeck;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FavoriteDeckRepository extends JpaRepository<FavoriteDeck, UUID> {
}
