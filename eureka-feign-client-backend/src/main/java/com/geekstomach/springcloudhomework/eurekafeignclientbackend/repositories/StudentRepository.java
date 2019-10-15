package com.geekstomach.springcloudhomework.eurekafeignclientbackend.repositories;


import com.geekstomach.springcloudhomework.eurekafeignclientbackend.entities.Student;
import com.geekstomach.springcloudhomework.eurekafeignclientbackend.entities.StudentDTO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
    List<StudentDTO> findAllBy();
    StudentDTO save(StudentDTO studentDTO);
}
