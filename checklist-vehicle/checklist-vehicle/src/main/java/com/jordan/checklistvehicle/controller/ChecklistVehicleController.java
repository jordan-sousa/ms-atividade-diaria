package com.jordan.checklistvehicle.controller;

import com.jordan.checklistvehicle.dto.ChecklistVehicleRequestDTO;
import com.jordan.checklistvehicle.dto.ChecklistVehicleResponseDTO;
import com.jordan.checklistvehicle.service.ChecklistVehicleService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/vehicle-checklists")
@RequiredArgsConstructor
public class ChecklistVehicleController {

    private final ChecklistVehicleService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ChecklistVehicleResponseDTO create(@RequestBody @Valid ChecklistVehicleRequestDTO dto) {
        return service.createChecklist(dto);
    }

    @GetMapping
    public List<ChecklistVehicleResponseDTO> findAll() {
        return service.getAllChecklists();
    }

    @GetMapping("/{id}")
    public ChecklistVehicleResponseDTO findById(@PathVariable UUID id) {
        return service.getChecklistById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) {
        service.deleteChecklist(id);
    }
}
