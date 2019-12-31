package com.jason.stusys.cloud.service.consumer.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "cloud-service-provider")
public interface StudentService {
    @RequestMapping(value = "get", method = RequestMethod.GET)
    String getStudent(@RequestParam(value = "id") String id);
}
