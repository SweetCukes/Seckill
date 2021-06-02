package com.miaoshaproject.error;

public enum EmBusinessError implements CommonError{
    //通用错误类型
    PARAMETER_VALIDATION_ERROR(10001,"参数不合法"),
    UNKNOWN_ERROR(10002,"未知错误"),

    //20000开头为用户信息相关错误定义
    USER_NOT_EXIST(20001,"用户不存在"),
    USER_LOGIN_FAIL(20002,"用户手机号或者密码不正确"),
    USER_NOT_LOGIN(20003,"用户还未登录！不能下单！"),
    //30000开头为交易信息错误
    STOCK_NOT_ENOUGH(30001,"库存不足"),
    ORDER_ITEM_NOT_EXIST(30002,"商品信息不存在"),
    ORDER_USER_NOT_EXIST(30003,"用户信息不存在"),
    ORDER_AMOUNT_ERROR(30004,"数量信息不正确"),

    //40000开头为活动信息错误
    MIAOSHA_INFO_ERROR(40001,"秒杀活动信息错误"),
    MIAOSHA_TIME_ERROR(40002,"秒杀活动信息错误"),
    ;

    private EmBusinessError(int errCode,String errMsg){
        this.errCode = errCode;
        this.errMsg =  errMsg;

    }

    private int errCode;
    private String errMsg;
    @Override
    public int getErrCode() {
        return this.errCode;
    }

    @Override
    public String getErrMsg() {
        return this.errMsg;
    }

    @Override
    public CommonError setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
}
