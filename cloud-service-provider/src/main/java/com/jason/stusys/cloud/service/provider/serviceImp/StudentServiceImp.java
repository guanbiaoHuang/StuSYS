package com.jason.stusys.cloud.service.provider.serviceImp;

import com.jason.stusys.cloud.service.provider.dto.Student;
import com.jason.stusys.cloud.service.provider.service.StudentService;
import org.springframework.stereotype.Service;


@Service
public class StudentServiceImp implements StudentService {
    @Override
    public boolean deleteStudent(String id) {
        return false;
    }

    @Override
    public Student getStudent(String id) {
        return new Student(id,"lixing","class-163");
    }

    @Override
    public boolean addStudent(Student student) {
        return false;
    }
}
