package com.syntaxllama.repositories;

import com.syntaxllama.entities.Flashcard;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FlashcardRepository extends JpaRepository<Flashcard, UUID> {
}