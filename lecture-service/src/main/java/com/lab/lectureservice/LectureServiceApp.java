package com.lab.lectureservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@SpringBootApplication
@RestController
public class LectureServiceApp {

    public static void main(String[] args) {
        SpringApplication.run(LectureServiceApp.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "Lecture Service is running";
    }

    
    @GetMapping("/lectures")
    public List<String> getLectures() {
        return Arrays.asList("Perera", "Dias", "Nimal");
    }
    

    
}
