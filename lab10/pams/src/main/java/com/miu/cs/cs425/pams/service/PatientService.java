package com.miu.cs.cs425.pams.service;

import java.time.LocalDate;
import java.time.Period;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miu.cs.cs425.pams.repository.PatientRepository;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    public void printAllPatients() {
        patientRepository.getAllPatients().stream()
                .sorted((p1, p2) -> Integer.compare(
                        calculateAge(p2.getDateOfBirth()),
                        calculateAge(p1.getDateOfBirth())))
                .forEach(patient -> System.out.println(patient.toJson()));
    }

    private int calculateAge(LocalDate dateOfBirth) {
        if (dateOfBirth == null) {
            return 0;
        }
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }
}
