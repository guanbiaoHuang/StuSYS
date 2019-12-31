package com.jason.stusys.cloud.service.consumer.feign.controller;

import com.jason.stusys.cloud.service.consumer.feign.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
    @RequestMapping(value = "get", method = RequestMethod.GET)
    public String findStudent(@RequestParam("id") String id){
        return studentService.getStudent(id);
    }


}
