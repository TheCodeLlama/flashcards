package com.syntaxllama.repositories;

import com.syntaxllama.entities.DeckGlobalStat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DeckGlobalStatRepository extends JpaRepository<DeckGlobalStat, UUID> {
}
