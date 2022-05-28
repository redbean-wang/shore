package com.shore.service;

import com.shore.factory.BaseResultFactory;
import com.shore.result.BaseResult;

public interface HelloService {
    String sayHello();

    BaseResult<String> sayData();

    BaseResult sayException();

    BaseResult sayBusinessException();

    BaseResult sayCity();
}
