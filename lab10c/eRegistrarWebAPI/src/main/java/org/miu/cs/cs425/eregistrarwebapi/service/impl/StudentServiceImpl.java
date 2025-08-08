package org.miu.cs.cs425.eregistrarwebapi.service.impl;

import org.miu.cs.cs425.eregistrarwebapi.model.Student;
import org.miu.cs.cs425.eregistrarwebapi.repository.StudentRepository;
import org.miu.cs.cs425.eregistrarwebapi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<Student> getStudentById(Long id) {
        return studentRepository.findById(id);
    }

    @Override
    public Student registerStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student updateStudent(Long id, Student studentDetails) {
        Optional<Student> existingStudent = studentRepository.findById(id);
        if (existingStudent.isPresent()) {
            Student student = existingStudent.get();
            student.setStudentNumber(studentDetails.getStudentNumber());
            student.setFirstName(studentDetails.getFirstName());
            student.setMiddleName(studentDetails.getMiddleName());
            student.setLastName(studentDetails.getLastName());
            student.setCgpa(studentDetails.getCgpa());
            student.setEnrollmentDate(studentDetails.getEnrollmentDate());
            student.setIsInternational(studentDetails.getIsInternational());
            return studentRepository.save(student);
        }
        throw new RuntimeException("Student not found with id: " + id);
    }

    @Override
    public void deleteStudent(Long id) {
        if (studentRepository.existsById(id)) {
            studentRepository.deleteById(id);
        } else {
            throw new RuntimeException("Student not found with id: " + id);
        }
    }
}
