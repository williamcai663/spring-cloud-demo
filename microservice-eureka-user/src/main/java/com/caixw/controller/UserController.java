package com.caixw.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {

    @Autowired
    private RestTemplate restTemplate;
    @Value("${target.service.url}")
    private String serviceUrl;

    @GetMapping("/hello")
    public String hello() {
        return "hello world";
    }

    @GetMapping("/order")
    @HystrixCommand(fallbackMethod = "callBack")
    public String getOrder() {
        System.out.println(serviceUrl);
        String result = restTemplate.getForObject(serviceUrl + "/order", String.class);
        return result;
    }

    private String callBack() {
        return "调用失败,请重试";
    }
}
