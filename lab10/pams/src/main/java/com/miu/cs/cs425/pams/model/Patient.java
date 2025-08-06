package com.miu.cs.cs425.pams.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Patient {
    private String firstName;
    private String lastName;
    private String contactPhoneNumber;
    private String email;
    private String mailingAddress;
    private LocalDate dateOfBirth;

    public String toJson() {
        return "{" +
            "\"firstName\": \"" + firstName + "\"," +
            "\"lastName\": \"" + lastName + "\"," +
            "\"contactPhoneNumber\": \"" + contactPhoneNumber + "\"," +
            "\"email\": \"" + email + "\"," +
            "\"mailingAddress\": \"" + mailingAddress + "\"," +
            "\"dateOfBirth\": \"" + dateOfBirth + "\"" +
            "}";
    }
}
