package com.syntaxllama.repositories;

import com.syntaxllama.entities.DeckStat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DeckStatRepository extends JpaRepository<DeckStat, UUID> {
}