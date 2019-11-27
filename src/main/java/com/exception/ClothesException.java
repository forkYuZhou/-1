package com.exception;

/**
 * Created by liuqiangqiang_v on 2019/11/27.
 * 异常类
 */

public class ClothesException extends Exception {

    private String errorMsg;
    private String errorCode;

    public ClothesException() {
        super();
    }

    public ClothesException(String errorMsg, String errorCode) {
        super(errorMsg);
        this.errorMsg = errorMsg;
        this.errorCode = errorCode;
    }

    public ClothesException(String errorMsg) {
        super(errorMsg);
        this.errorMsg = errorMsg;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
