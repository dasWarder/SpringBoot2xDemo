package ru.demo.util;

import ru.demo.entity.BaseResponse;

public class BaseResponseData {

    public static final String sharedKey = "SHARED_KEY";
    public static final String SUCCESS_STATUS = "success";
    public static final String ERROR_STATUS = "error";
    private static final int CODE_SUCCESS = 100;
    private static final int AUTH_FAILURE = 200;

    public BaseResponseData() {
    }

    public static BaseResponse getSuccess() {
        return new BaseResponse(SUCCESS_STATUS, CODE_SUCCESS);
    }

    public static BaseResponse getFailure(){
        return new BaseResponse(ERROR_STATUS, AUTH_FAILURE);
    }
}
