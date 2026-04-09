package com.lab.studentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@SpringBootApplication
@RestController
public class StudentServiceApp {

    public static void main(String[] args) {
        SpringApplication.run(StudentServiceApp.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "Student Service is running";
    }

    
    @GetMapping("/students")
    public List<String> getStudents() {
        return Arrays.asList("Alice", "Bob", "Charlie");
    }
    

    
}
