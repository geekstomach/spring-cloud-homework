package com.geekstomach.springcloudhomework.eurekafeignclientbackend.sevices;


import com.geekstomach.springcloudhomework.eurekafeignclientbackend.entities.StudentDTO;

import java.util.List;

public interface StudentService {

    List<StudentDTO> getAllStudents();
    StudentDTO insertStudent(StudentDTO student);
    void deleteStudent(Long id);
}
