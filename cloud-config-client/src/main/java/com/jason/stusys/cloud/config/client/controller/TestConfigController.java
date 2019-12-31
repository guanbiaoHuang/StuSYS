package com.jason.stusys.cloud.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestConfigController {

    @Value("${demo.message}")
    private String foo;

    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String testConfig(){
        return foo;
    }
}
