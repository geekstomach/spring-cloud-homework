package com.geekstomach.springcloudhomework.eurekafeignclientfrontend.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor

public class Student implements Serializable {

    private Long id;


    private String firstName;


    private String lastName;

    private int mark;}