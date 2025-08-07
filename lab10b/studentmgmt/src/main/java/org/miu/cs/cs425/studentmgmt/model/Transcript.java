package org.miu.cs.cs425.studentmgmt.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter
@ToString
public class Transcript {
    @Id
    @GeneratedValue
    private Long id;
    private String studentNumber;
    private String courseName;
    private Double grade;
}
