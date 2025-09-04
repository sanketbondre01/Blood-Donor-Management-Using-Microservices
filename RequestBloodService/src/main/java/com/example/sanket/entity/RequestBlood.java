package com.example.sanket.entity;

import com.example.sanket.enums.RequestStatus;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RequestBlood {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Patient name is required")
    @Column
    private String patientName;

    @NotBlank(message = "Blood group is required")
    @Column
    private String bloodGroup;

    @NotBlank(message = "City is required")
    @Column
    private String city;

    @Min(value = 1, message = "Quantity must be at least 1 unit")
    @Column
    private int quantity;

    @Enumerated(EnumType.STRING)
    @Column
    private RequestStatus status; 
}
