package com.springrest.springrest.Services;

import com.springrest.springrest.Entities.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{

    List<Course> list;

    public CourseServiceImpl (){
        list = new ArrayList<>();
        list.add(new Course(145, "Java Core Course", "This course contains basics of java"));
        list.add(new Course(146, "Springboot Course", "This is springboot course"));
    }

    @Override
    public List<Course> getCourses() {

        return null;
    }

    @Override
    public Course getCourse(long courseId) {
        Course c =null;
        for(Course course:list)
        {
            if (course.getId() == courseId)
                c= course;
            break;
        }
        return c;
    }

    @Override
    public Course addCourse(Course course) {
        list.add(course);
        return null;
    }

    @Override
    public Course updateCourse(Course course) {
        list.
        return null;
    }

}
