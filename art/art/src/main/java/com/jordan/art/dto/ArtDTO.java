package com.jordan.art.dto;

import java.time.LocalDate;
import java.util.UUID;

public record ArtDTO(
        UUID id,
        String taskLocation,
        String executorName,
        String employeeId,
        LocalDate taskDate
) {
}
