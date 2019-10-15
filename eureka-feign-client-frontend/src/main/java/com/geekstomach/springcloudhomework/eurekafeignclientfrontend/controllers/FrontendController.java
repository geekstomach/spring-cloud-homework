package com.geekstomach.springcloudhomework.eurekafeignclientfrontend.controllers;

import com.geekstomach.springcloudhomework.eurekafeignclientfrontend.entities.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class FrontendController {

    private Frontend frontend;

    @Autowired
    public void setFrontend(Frontend frontend) {
        this.frontend = frontend;
    }

    @GetMapping("/")
    public String getAllStudents(Model model) {
        List<Student> students = frontend.getAllStudents();
        model.addAttribute("students", students);
        return "students";
    }

    @PostMapping("/new")
    public String insertStudent(Model model, @ModelAttribute(name = "student") Student student) {
        frontend.createNewStudent(student);
        return "students";
    }

    @GetMapping("/new")
    public String addStudent(@ModelAttribute(name = "student") Student student) {
        return "addStudent";
    }

    @RequestMapping("/remove/{id}")
    public String addStudent(@PathVariable("id") Long id) {
        frontend.deleteStudent(id);
        return "students";
    }
}
