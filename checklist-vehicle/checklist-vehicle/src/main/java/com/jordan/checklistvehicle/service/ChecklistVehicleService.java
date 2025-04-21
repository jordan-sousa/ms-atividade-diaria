package com.jordan.checklistvehicle.service;

import com.jordan.checklistvehicle.dto.ChecklistVehicleRequestDTO;
import com.jordan.checklistvehicle.dto.ChecklistVehicleResponseDTO;

import java.util.List;
import java.util.UUID;

public interface ChecklistVehicleService {

    ChecklistVehicleResponseDTO createChecklist(ChecklistVehicleRequestDTO dto);

    List<ChecklistVehicleResponseDTO> getAllChecklists();

    ChecklistVehicleResponseDTO getChecklistById(UUID id);

    void deleteChecklist(UUID id);
}
