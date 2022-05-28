package com.shore.service.impl;

import com.shore.factory.BaseResultFactory;
import com.shore.result.BaseResult;
import com.shore.service.HelloService;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {
    public String sayHello() {
        return "Hello World!";
    }

    public BaseResult<String> sayData() {
        return BaseResultFactory.success("Hello World!");
    }
}
