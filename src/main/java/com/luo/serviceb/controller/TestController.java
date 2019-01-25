package com.luo.serviceb.controller;

import com.luo.serviceb.feign.Service_aApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("service-b")
public class TestController {

    @Autowired
    Service_aApi service_aApi;

    @GetMapping("getTest")
    public String getTest(){
        return service_aApi.getTest();
    }
}
