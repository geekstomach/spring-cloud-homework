package com.geekstomach.springcloudhomework.eurekafeignclientbackend.controllers;


import com.geekstomach.springcloudhomework.eurekafeignclientbackend.entities.StudentDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface StudentController {
    @RequestMapping("/students")
    List<StudentDTO> getAllStudents();


    @PostMapping("/students")
    StudentDTO createNewStudent(@RequestBody StudentDTO newStudent);




    @DeleteMapping("/students/{id}")
    void deleteStudent(@PathVariable("id") Long id);
}
