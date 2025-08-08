package org.miu.cs.cs425.eregistrarwebapi.service;

import org.miu.cs.cs425.eregistrarwebapi.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    List<Student> getAllStudents();
    Optional<Student> getStudentById(Long id);
    Student registerStudent(Student student);
    Student updateStudent(Long id, Student student);
    void deleteStudent(Long id);
}
