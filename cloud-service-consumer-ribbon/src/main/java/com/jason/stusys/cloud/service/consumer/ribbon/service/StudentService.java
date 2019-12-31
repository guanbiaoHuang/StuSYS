package com.jason.stusys.cloud.service.consumer.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class StudentService {

    @Autowired
    private RestTemplate restTemplate;

    public String getStudent(String id) {
        return restTemplate.getForObject("http://CLOUD-SERVICE-PROVIDER/get?id=" + id, String.class);
    }
}