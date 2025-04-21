package com.jordan.checklistvehicle.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record ChecklistVehicleRequestDTO(
        @NotBlank String vehiclePlate,
        @NotBlank String vehicleModel,
        @NotNull LocalDate checklistDate,
        Boolean tiresOk,
        Boolean brakesOk,
        Boolean lightsOk,
        Boolean oilLevelOk,
        Boolean documentsOk,
        String notes,
        @NotBlank String driverName,
        @NotBlank String driverRegistrationNumber
) {
}
