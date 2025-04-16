package com.syntaxllama.repositories;

import com.syntaxllama.entities.FlashcardOption;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FlashcardOptionRepository extends JpaRepository<FlashcardOption, UUID> {
}
