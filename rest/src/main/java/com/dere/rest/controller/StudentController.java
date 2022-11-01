package com.dere.rest.controller;

import com.dere.rest.model.Student;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/student")
@AllArgsConstructor
public class StudentController {

    @PostMapping
    public void addStudent(@RequestBody Student student){

    }

    @GetMapping
    public List<Student> getStudents(){
        return null;
    }

    @GetMapping("/{id}")
    public Student getOneStudent(@PathVariable int id){
        return null;
    }

}
