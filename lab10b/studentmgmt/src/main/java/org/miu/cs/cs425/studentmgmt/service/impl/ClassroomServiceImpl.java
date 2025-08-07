package org.miu.cs.cs425.studentmgmt.service.impl;

import org.miu.cs.cs425.studentmgmt.model.Classroom;
import org.miu.cs.cs425.studentmgmt.repository.ClassroomRepository;
import org.miu.cs.cs425.studentmgmt.service.ClassroomService;
import org.springframework.stereotype.Service;

@Service
public class ClassroomServiceImpl implements ClassroomService {
    private final ClassroomRepository classroomRepository;

    public ClassroomServiceImpl(ClassroomRepository classroomRepository) {
        this.classroomRepository = classroomRepository;
    }

    @Override
    public Classroom saveClassroom(Classroom classroom) {
        return classroomRepository.save(classroom);
    }
}
