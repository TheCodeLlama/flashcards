package com.syntaxllama.repositories;

import com.syntaxllama.entities.FlashcardStat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FlashcardStatRepository extends JpaRepository<FlashcardStat, UUID> {
}