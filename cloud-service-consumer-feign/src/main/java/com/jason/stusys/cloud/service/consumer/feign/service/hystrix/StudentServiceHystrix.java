package com.jason.stusys.cloud.service.consumer.feign.service.hystrix;

import com.jason.stusys.cloud.service.consumer.feign.service.StudentService;
import org.springframework.stereotype.Component;

@Component
public class StudentServiceHystrix implements StudentService {
    //重写后为触发熔断器的方法
    @Override
    public String getStudent(String id) {
        return "feign: no response while trying to find student " + id;
    }
}
