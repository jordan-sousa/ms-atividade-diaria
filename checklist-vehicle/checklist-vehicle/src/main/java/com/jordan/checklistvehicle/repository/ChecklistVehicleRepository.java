package com.jordan.checklistvehicle.repository;

import com.jordan.checklistvehicle.model.ChecklistVehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ChecklistVehicleRepository extends JpaRepository<ChecklistVehicle, UUID> {

    List<ChecklistVehicle> findByUserId(UUID userId);

}
