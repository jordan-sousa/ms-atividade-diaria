package com.jordan.checklistvehicle.service.impl;

import com.jordan.checklistvehicle.dto.ChecklistVehicleRequestDTO;
import com.jordan.checklistvehicle.dto.ChecklistVehicleResponseDTO;
import com.jordan.checklistvehicle.exception.ResourceNotFoundException;
import com.jordan.checklistvehicle.mapper.ChecklistVehicleMapper;
import com.jordan.checklistvehicle.model.ChecklistVehicle;
import com.jordan.checklistvehicle.repository.ChecklistVehicleRepository;
import com.jordan.checklistvehicle.service.ChecklistVehicleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ChecklistVehicleServiceImpl implements ChecklistVehicleService {
    private final ChecklistVehicleRepository repository;
    private final ChecklistVehicleMapper mapper;

    @Override
    public ChecklistVehicleResponseDTO createChecklist(ChecklistVehicleRequestDTO dto) {
        ChecklistVehicle checklist = mapper.toEntity(dto);
        ChecklistVehicle saved = repository.save(checklist);
        return mapper.toResponse(saved);
    }

    @Override
    public List<ChecklistVehicleResponseDTO> getAllChecklists() {
        return repository.findAll()
                .stream()
                .map(mapper::toResponse)
                .toList();

    }

    @Override
    public ChecklistVehicleResponseDTO getChecklistById(UUID id) {
        ChecklistVehicle checklist = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Lista de verificação não encontrada com id " + id));
        return mapper.toResponse(checklist);
    }

    @Override
    public void deleteChecklist(UUID id) {
        if (!repository.existsById(id)) {
            throw new ResourceNotFoundException("Lista de verificação não encontrada com id " + id);
        }
        repository.deleteById(id);
    }

    @Override
    public List<ChecklistVehicleResponseDTO> getChecklistsByUserId(UUID userId) {
        return repository.findByUserId(userId)
                .stream()
                .map(mapper::toResponse)
                .toList();
    }

}
