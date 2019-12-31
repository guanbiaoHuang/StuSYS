package com.jason.stusys.cloud.service.provider.service;

import com.jason.stusys.cloud.service.provider.dto.Student;


public interface StudentService {

    public boolean deleteStudent(String id);

    public Student getStudent(String id);

    public boolean addStudent(Student student);
}
