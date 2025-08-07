package org.miu.cs.cs425.studentmgmt.service.impl;

import org.miu.cs.cs425.studentmgmt.model.Student;
import org.miu.cs.cs425.studentmgmt.repository.StudentRepository;
import org.miu.cs.cs425.studentmgmt.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void getAllStudents() {

    }

    @Override
    public Student getStudentById(Integer id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
}
