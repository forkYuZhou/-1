package com.exception;

public enum BusinessErrorCode {


    CLUTHER_IS_NULL("未查询出数据");

    BusinessErrorCode(String reasonPhrase) {
        this.reasonPhrase = reasonPhrase;
    }

    private final String reasonPhrase;

    public String getReasonPhrase() {
        return this.reasonPhrase;
    }

}

