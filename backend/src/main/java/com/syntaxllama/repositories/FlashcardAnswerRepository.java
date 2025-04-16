package com.syntaxllama.repositories;

import com.syntaxllama.entities.FlashcardAnswer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FlashcardAnswerRepository extends JpaRepository<FlashcardAnswer, UUID> {
}
