package org.miu.cs.cs425.studentmgmt.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

/*

studentId : long (Primary key)
studentNumber : (required, unique) (e.g. Data values: 000-61-0001, 000-61-0002, etc.)
firstName : (required) (e.g.  Data values: "Anna", "Bob" etc.)

middleName : (is optional) (e.g.  Data values: "Lynn", "" etc.)

lastName: (required) (e.g.  Data values: "Smith", "Galverston" etc.)
cgpa : (is optional) (e.g. Data values: 3.45, 2.87, etc)
dateOfEnrollment (This field contains date values; representing the date of enrollment of the student)
* */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Student {
    @Id
    @GeneratedValue
    private Long studentId;
    private String studentNumber;
    private String firstName;
    private String middleName;
    private String lastName;
    private Double cgpa;
    private String dateOfEnrollment;
    private Long id;
}
