package org.miu.cs.cs425.studentmgmt.service;

import org.miu.cs.cs425.studentmgmt.model.Student;

public interface StudentService {
    void getAllStudents();
    Student getStudentById(Integer id);
    Student saveStudent(Student student);
}
