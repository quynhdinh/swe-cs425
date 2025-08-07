package org.miu.cs.cs425.studentmgmt.repository;

import org.miu.cs.cs425.studentmgmt.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
