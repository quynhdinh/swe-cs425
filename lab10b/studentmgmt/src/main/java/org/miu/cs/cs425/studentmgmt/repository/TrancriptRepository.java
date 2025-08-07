package org.miu.cs.cs425.studentmgmt.repository;

import org.miu.cs.cs425.studentmgmt.model.Transcript;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrancriptRepository extends JpaRepository<Transcript, Long> {
}
