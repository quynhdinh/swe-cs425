package org.miu.cs.cs425.studentmgmt.service;

import org.miu.cs.cs425.studentmgmt.model.Student;

public interface StudentService {
    void getAllStudents();
    Student getStudentById(Long id);
    Student saveStudent(Student student);
}
