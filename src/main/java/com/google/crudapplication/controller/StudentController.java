package com.google.crudapplication.controller;

import com.google.crudapplication.dto.StudentDTO;
import com.google.crudapplication.sevice.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(@RequestBody StudentService studentService) {
        this.studentService = studentService;
    }


    @PostMapping
    public void add(StudentDTO studentDTO) {
        studentService.add(studentDTO);

    }


}
