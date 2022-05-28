package com.shore.service;

import com.shore.result.BaseResult;

public interface HelloService {
    String sayHello();

    BaseResult<String> sayData();
}
