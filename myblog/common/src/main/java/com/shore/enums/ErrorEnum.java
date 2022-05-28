package com.shore.enums;

import com.shore.utils.CollectionUtils;
import com.shore.utils.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum ErrorEnum {
    SYSTEM_ERROR("E0001", "系统异常"),
    UN_KNOW_ERROR("E0002", "未知异常"),
    ;

    private String code;

    private String msg;

    ErrorEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static ErrorEnum getErrorEnum(String param) {
        if (StringUtils.isEmpty(param)) {
            return ErrorEnum.UN_KNOW_ERROR;
        }
        List<ErrorEnum> list = Arrays.stream(ErrorEnum.values())
                .filter(errorEnum -> StringUtils.anyEquals(param, errorEnum.getCode(), errorEnum.getMsg()))
                .collect(Collectors.toList());
        return CollectionUtils.isEmpty(list) ? ErrorEnum.UN_KNOW_ERROR : list.get(0);
    }
}
