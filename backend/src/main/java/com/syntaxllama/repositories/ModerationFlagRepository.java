package com.syntaxllama.repositories;

import com.syntaxllama.entities.ModerationFlag;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ModerationFlagRepository extends JpaRepository<ModerationFlag, UUID> {
}
