package org.miu.cs.cs425.eregistrarwebapi.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "students")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    
    @Column(name = "student_number", nullable = false, unique = true)
    @NotBlank(message = "Student number is required")
    private String studentNumber;
    
    @Column(name = "first_name", nullable = false)
    @NotBlank(message = "First name is required")
    private String firstName;
    
    @Column(name = "middle_name")
    private String middleName;
    
    @Column(name = "last_name", nullable = false)
    @NotBlank(message = "Last name is required")
    private String lastName;
    
    @Column(name = "cgpa")
    private Double cgpa;
    
    @Column(name = "enrollment_date", nullable = false)
    @NotNull(message = "Enrollment date is required")
    private LocalDate enrollmentDate;
    
    @Column(name = "is_international", nullable = false)
    @NotBlank(message = "International status is required")
    private String isInternational;
}
