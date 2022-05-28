package com.shore.controller;

import com.shore.result.BaseResult;
import com.shore.service.impl.HelloServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private HelloServiceImpl helloService;

    @GetMapping("/test1")
    public String test1() {
        return helloService.sayHello();
    }

    @GetMapping("/test2")
    public BaseResult test2() {
        return helloService.sayData();
    }
}
