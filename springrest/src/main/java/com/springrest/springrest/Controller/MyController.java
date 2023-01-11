package com.springrest.springrest.Controller;

import com.springrest.springrest.Entities.Course;
import com.springrest.springrest.Services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {
     @Autowired
    private CourseService courseService;

     //@RequestMapping(path = "/courses", method = RequestMethod.GET) -- for mvc we use this
    @GetMapping(path="/home", consumes= "application/json")
    public String home()
    {
     return "Welcome to courses Application";
    }

    @GetMapping("/courses")
    public List<Course> getCourses()
    {
      return this.courseService.getCourses();
    }

    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable String courseId){
        return this.courseService.getCourse(Long.parseLong(courseId));
    }

    @PostMapping(path = "/courses", consumes = "application/json")
    public Course addCourse(@RequestBody Course course){
        return this.courseService.addCourse(course);

    }
}
