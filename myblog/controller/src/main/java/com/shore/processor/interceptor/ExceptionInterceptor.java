package com.shore.processor.interceptor;

import com.shore.enums.ErrorEnum;
import com.shore.exception.BusinessException;
import com.shore.factory.BaseResultFactory;
import com.shore.result.BaseResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionInterceptor {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public BaseResult handleException(Exception e) {
        e.printStackTrace();
        return BaseResultFactory.fail(ErrorEnum.SYSTEM_ERROR.getCode());
    }

    @ExceptionHandler(BusinessException.class)
    @ResponseBody
    public BaseResult handleBusinessException(BusinessException e) {
        e.printStackTrace();
        return BaseResultFactory.fail(e.getCode());
    }
}
