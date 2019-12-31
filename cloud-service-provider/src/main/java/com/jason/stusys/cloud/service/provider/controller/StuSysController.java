package com.jason.stusys.cloud.service.provider.controller;

import com.jason.stusys.cloud.service.provider.dto.Student;
import com.jason.stusys.cloud.service.provider.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StuSysController {
    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "get", method = RequestMethod.GET)
    public String findStudent(@RequestParam("id") String id){
        System.out.println("通过controller调用");
        Student student = studentService.getStudent(id);
        return student.toString();
    }

}
