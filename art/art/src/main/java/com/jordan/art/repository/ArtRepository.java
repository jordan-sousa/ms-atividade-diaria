package com.jordan.art.repository;

import com.jordan.art.model.Art;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Arrays;
import java.util.UUID;

public interface ArtRepository extends JpaRepository<Art, UUID> {
    Arrays findByUserId(UUID userId);
}
