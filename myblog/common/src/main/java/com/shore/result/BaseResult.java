package com.shore.result;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class BaseResult<T> {

    private boolean success;

    private String code;

    private String message;

    private T data;

}
