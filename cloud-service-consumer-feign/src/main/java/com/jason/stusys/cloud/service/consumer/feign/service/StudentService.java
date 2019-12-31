package com.jason.stusys.cloud.service.consumer.feign.service;

import com.jason.stusys.cloud.service.consumer.feign.service.hystrix.StudentServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "cloud-service-provider", fallback = StudentServiceHystrix.class)
public interface StudentService {
    @RequestMapping(value = "get", method = RequestMethod.GET)
    String getStudent(@RequestParam(value = "id") String id);
}
