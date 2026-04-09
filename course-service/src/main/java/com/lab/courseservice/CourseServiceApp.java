package com.lab.courseservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@SpringBootApplication
@RestController
public class CourseServiceApp {

    public static void main(String[] args) {
        SpringApplication.run(CourseServiceApp.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "Course Service is running";
    }

    

    
    @GetMapping("/courses")
    public List<String> getCourses() {
        return Arrays.asList("Math", "Physics", "Chemistry");
    }
    
}
