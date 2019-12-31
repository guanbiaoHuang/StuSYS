package com.jason.stusys.cloud.service.consumer.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class StudentService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "serviceNotResponse")
    public String getStudent(String id) {
        return restTemplate.getForObject("http://CLOUD-SERVICE-PROVIDER/get?id=" + id, String.class);
    }

    public String serviceNotResponse(String id){
        return "no response while trying to find student "+id;
    }
}