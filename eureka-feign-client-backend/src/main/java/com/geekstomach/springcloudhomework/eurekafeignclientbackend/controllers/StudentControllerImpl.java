package com.geekstomach.springcloudhomework.eurekafeignclientbackend.controllers;


import com.geekstomach.springcloudhomework.eurekafeignclientbackend.entities.StudentDTO;
import com.geekstomach.springcloudhomework.eurekafeignclientbackend.sevices.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentControllerImpl implements StudentController {

    private StudentService studentService;

    @Autowired
    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    @Override
    public List<StudentDTO> getAllStudents() {
        return studentService.getAllStudents();
    }

    @Override
    public StudentDTO createNewStudent(@RequestBody StudentDTO newStudent) {
        return studentService.insertStudent(newStudent);
    }

    @Override
    public void deleteStudent(Long id) {
        studentService.deleteStudent(id);
    }
}
