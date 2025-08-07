package org.miu.cs.cs425.studentmgmt.repository;

import org.miu.cs.cs425.studentmgmt.model.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassroomRepository extends JpaRepository<Classroom, Long> {
}
