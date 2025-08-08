package org.miu.cs.cs425.eregistrarwebapi.config;

import org.miu.cs.cs425.eregistrarwebapi.model.Student;
import org.miu.cs.cs425.eregistrarwebapi.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {
        // Check if data already exists
        if (studentRepository.count() == 0) {
            // Create sample students
            Student student1 = new Student();
            student1.setStudentNumber("000-61-0001");
            student1.setFirstName("Anna");
            student1.setMiddleName("Marie");
            student1.setLastName("Smith");
            student1.setCgpa(3.78);
            student1.setEnrollmentDate(LocalDate.of(2019, 5, 12));
            student1.setIsInternational("No");

            Student student2 = new Student();
            student2.setStudentNumber("000-61-0002");
            student2.setFirstName("John");
            student2.setLastName("Doe");
            student2.setCgpa(3.45);
            student2.setEnrollmentDate(LocalDate.of(2020, 8, 15));
            student2.setIsInternational("Yes");

            Student student3 = new Student();
            student3.setStudentNumber("000-61-0003");
            student3.setFirstName("Sarah");
            student3.setMiddleName("Elizabeth");
            student3.setLastName("Johnson");
            student3.setCgpa(3.92);
            student3.setEnrollmentDate(LocalDate.of(2018, 1, 20));
            student3.setIsInternational("No");

            // Save students to database
            studentRepository.save(student1);
            studentRepository.save(student2);
            studentRepository.save(student3);

            System.out.println("Sample data loaded successfully!");
        }
    }
}
