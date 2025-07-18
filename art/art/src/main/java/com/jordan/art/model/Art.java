package com.jordan.art.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "arts")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Art {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "user_id", nullable = true)
    private UUID userId;

    @Column(name = "task_location", nullable = false)
    private String taskLocation;

    @Column(name = "executor_name", nullable = false)
    private String executorName;

    @Column(name = "employee_id", nullable = false)
    private String employeeId;

    @Column(name = "task_date", nullable = false)
    private LocalDate taskDate;


}
