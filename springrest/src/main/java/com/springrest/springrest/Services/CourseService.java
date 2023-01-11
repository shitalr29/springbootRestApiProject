package com.springrest.springrest.Services;

import com.springrest.springrest.Entities.Course;

import java.util.List;

public interface CourseService {

    public List<Course> getCourses();

    public Course getCourse(long courseId);

    Course addCourse(Course course);

    Course updateCourse(Course course);
}
