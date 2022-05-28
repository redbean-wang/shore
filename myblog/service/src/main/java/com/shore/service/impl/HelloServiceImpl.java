package com.shore.service.impl;

import com.shore.enums.ErrorEnum;
import com.shore.exception.BusinessException;
import com.shore.factory.BaseResultFactory;
import com.shore.mapper.TestMapper;
import com.shore.result.BaseResult;
import com.shore.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {
    @Autowired
    private TestMapper mapper;

    public String sayHello() {
        return "Hello World!";
    }

    public BaseResult<String> sayData() {
        return BaseResultFactory.success("Hello World!");
    }

    public BaseResult sayException() {
        return BaseResultFactory.success(String.valueOf(1/0));
    }

    public BaseResult sayBusinessException() {
        throw new BusinessException(ErrorEnum.SYSTEM_ERROR);
    }

    public BaseResult sayCity() {
        return BaseResultFactory.success(mapper.getById(1));
    }
}
