package com.shore.controller;

import com.shore.result.BaseResult;
import com.shore.service.impl.HelloServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "测试模块")
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

    @GetMapping("test3")
    public BaseResult test3() {
        return helloService.sayException();
    }

    @GetMapping("test4")
    public BaseResult test4() {
        return helloService.sayBusinessException();
    }

    @GetMapping("test5")
    @ApiOperation("测试接口")
    public BaseResult test5() {
        return helloService.sayCity();
    }
}
