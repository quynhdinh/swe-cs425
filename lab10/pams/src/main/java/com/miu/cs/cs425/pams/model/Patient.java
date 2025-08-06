package com.miu.cs.cs425.pams.model;

import java.time.LocalDate;

public class Patient {
    private String firstName;
    private String lastName;
    private String contactPhoneNumber;
    private String email;
    private String mailingAddress;
    private LocalDate dateOfBirth;
    // constructors, getters, and setters
    public Patient(String firstName, String lastName, String contactPhoneNumber, String email, String mailingAddress, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactPhoneNumber = contactPhoneNumber;
        this.email = email;
        this.mailingAddress = mailingAddress;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getContactPhoneNumber() {
        return contactPhoneNumber;
    }

    public void setContactPhoneNumber(String contactPhoneNumber) {
        this.contactPhoneNumber = contactPhoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMailingAddress() {
        return mailingAddress;
    }

    public void setMailingAddress(String mailingAddress) {
        this.mailingAddress = mailingAddress;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

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
