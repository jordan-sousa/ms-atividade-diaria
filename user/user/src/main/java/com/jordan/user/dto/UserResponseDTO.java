package com.jordan.user.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Builder
public record UserResponseDTO(
        UUID id,
        String name,
        String email
) {
}
