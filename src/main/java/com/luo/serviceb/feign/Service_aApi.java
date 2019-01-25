package com.luo.serviceb.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "SERVICE-A")
public interface Service_aApi {

    @GetMapping("/service-a/test")
    public String getTest();
}
