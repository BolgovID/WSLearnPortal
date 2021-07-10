package ua.ws.learnportal.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.ws.learnportal.domain.Course;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {
    private final List<Course> courses = new ArrayList<>();

    public CourseController() {
        courses.add(new Course(1, "Java", "Java description", 10.0));
        courses.add(new Course(2, "Python", "Python description", 20.0));
        courses.add(new Course(3, ".Net", ".Net description", 30.0));
        courses.add(new Course(4, "C++", "C++ description", 40.0));
        courses.add(new Course(5, "Js", "Js description", 50.0));
    }

    @GetMapping("/list")
    public ResponseEntity<List<Course>> getList() {
        return new ResponseEntity<>(courses, HttpStatus.OK);
    }
}
