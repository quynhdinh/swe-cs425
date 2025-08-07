package org.miu.cs.cs425.studentmgmt.service.impl;

import org.miu.cs.cs425.studentmgmt.model.Course;
import org.miu.cs.cs425.studentmgmt.repository.CourseRepository;
import org.miu.cs.cs425.studentmgmt.service.CourseService;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {
    private final CourseRepository courseRepository;

    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public Course saveCourse(Course course) {
        return courseRepository.save(course);
    }
}
