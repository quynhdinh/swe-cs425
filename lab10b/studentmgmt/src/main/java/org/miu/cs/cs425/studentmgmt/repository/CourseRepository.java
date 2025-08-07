package org.miu.cs.cs425.studentmgmt.repository;

import org.miu.cs.cs425.studentmgmt.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
