package com.shore.factory;

import com.shore.enums.ErrorEnum;
import com.shore.result.BaseResult;

public class BaseResultFactory {
    /**
     * 构建成功基本结果模型
     *
     * @return
     */
    public static BaseResult success() {
        return BaseResult.builder().success(true).code("200").message("success").build();
    }

    public static BaseResult success(Object data) {
        return success().builder().data(data).build();
    }

    /**
     * 构造失败基本结果模型
     *
     * @param param 错误码或错误信息
     * @return
     */
    public static BaseResult fail(String param) {
        ErrorEnum errorEnum = ErrorEnum.getErrorEnum(param);
        return BaseResult.builder().success(false)
                .code(errorEnum.getCode()).message(errorEnum.getMsg()).build();
    }
}
