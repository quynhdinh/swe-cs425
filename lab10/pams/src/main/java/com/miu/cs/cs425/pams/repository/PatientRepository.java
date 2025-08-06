package com.miu.cs.cs425.pams.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.miu.cs.cs425.pams.model.Patient;

@Repository
public class PatientRepository {
    public List<Patient> getAllPatients() {
        return List.of(
            new Patient("Daniel", "Agar", "(641) 123-0009", "dagar@m.as", "1 N Street", LocalDate.of(1987, 1, 19)),
            new Patient("Ana", "Smith", "(641) 123-0009", "amsith@te.edu", "1 N Street", LocalDate.of(1987, 1, 19)),
            new Patient("Marcus", "Garvey", "(123) 292-0018", "mgarvey@te.edu", "4 East Ave", LocalDate.of(2001, 9, 18)),
            new Patient("Jeff", "Goldbloom", "(999) 165-1192", "jgold@es.co.za", "1 N Street", LocalDate.of(1995, 2, 28)),
            new Patient("Mary", "Washington", "(641) 123-0009", "mwashington@te.edu", "30 W Burlington", LocalDate.of(1932, 5, 31))
        );
    }
}