package com.jordan.checklistvehicle.mapper;

import com.jordan.checklistvehicle.dto.ChecklistVehicleRequestDTO;
import com.jordan.checklistvehicle.dto.ChecklistVehicleResponseDTO;
import com.jordan.checklistvehicle.model.ChecklistVehicle;
import org.springframework.stereotype.Component;

@Component
public class ChecklistVehicleMapper {

    public ChecklistVehicle toEntity(ChecklistVehicleRequestDTO dto) {
        return ChecklistVehicle.builder()
                .userId(dto.userId())
                .vehiclePlate(dto.vehiclePlate())
                .vehicleModel(dto.vehicleModel())
                .checklistDate(dto.checklistDate())
                .tiresOk(dto.tiresOk())
                .brakesOk(dto.brakesOk())
                .lightsOk(dto.lightsOk())
                .oilLevelOk(dto.oilLevelOk())
                .documentsOk(dto.documentsOk())
                .notes(dto.notes())
                .driverName(dto.driverName())
                .driverRegistrationNumber(dto.driverRegistrationNumber())
                .build();
    }

    public ChecklistVehicleResponseDTO toResponse(ChecklistVehicle entity){
        return new ChecklistVehicleResponseDTO(
                entity.getId(),
                entity.getUserId(),
                entity.getVehiclePlate(),
                entity.getVehicleModel(),
                entity.getChecklistDate(),
                entity.getTiresOk(),
                entity.getBrakesOk(),
                entity.getLightsOk(),
                entity.getOilLevelOk(),
                entity.getDocumentsOk(),
                entity.getNotes(),
                entity.getDriverName(),
                entity.getDriverRegistrationNumber()
        );
    }
}
