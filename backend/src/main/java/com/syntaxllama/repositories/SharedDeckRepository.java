package com.syntaxllama.repositories;

import com.syntaxllama.entities.SharedDeck;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SharedDeckRepository extends JpaRepository<SharedDeck, UUID> {
}
