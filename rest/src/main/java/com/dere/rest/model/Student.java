package com.dere.rest.model;

import lombok.Data;

import java.util.List;

@Data
public class Student {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String major;
    private double gpa;
    List<Course> coursesTaken;
}
