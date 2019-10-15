package com.geekstomach.springcloudhomework.eurekafeignclientfrontend.controllers;

import com.geekstomach.springcloudhomework.eurekafeignclientfrontend.entities.Student;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient("eureka-feign-client-backend") //имя микросервиса куда посылается запрос(должен быть зарегистрирован на эвреке)
public interface Frontend {
    @RequestMapping("/students")
    List<Student> getAllStudents();

    @PostMapping("/students")
    Student createNewStudent(@RequestBody Student newStudent);

    @DeleteMapping("students/{id}")
    void deleteStudent(@PathVariable("id") Long id);
}
