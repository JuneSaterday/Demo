package com.lff.demo.service;

import com.lff.demo.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> queryStudent();

    boolean addStudent(Student student);

    Student queryStudentById(String id);
}
