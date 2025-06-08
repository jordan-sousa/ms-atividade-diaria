package com.jordan.checklistvehicle.dto;

import java.time.LocalDate;
import java.util.UUID;

public record ChecklistVehicleResponseDTO(
        UUID id,
        UUID userId,
        String vehiclePlate,
        String vehicleModel,
        LocalDate checklistDate,
        Boolean tiresOk,
        Boolean brakesOk,
        Boolean lightsOk,
        Boolean oilLevelOk,
        Boolean documentsOk,
        String notes,
        String driverName,
        String driverRegistrationNumber
) {
}
