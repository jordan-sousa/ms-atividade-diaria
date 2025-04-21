package com.jordan.checklistvehicle.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import lombok.*;

import java.util.UUID;

@Entity(name = "ChecklistVehicle")
@Table(name = "checklist_vehicles")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ChecklistVehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String vehiclePlate;
    private String vehicleModel;
    private LocalDate checklistDate;

    private Boolean tiresOk;
    private Boolean brakesOk;
    private Boolean lightsOk;
    private Boolean oilLevelOk;
    private Boolean documentsOk;

    private String notes;
    private String driverName;
    private String driverRegistrationNumber;

}
