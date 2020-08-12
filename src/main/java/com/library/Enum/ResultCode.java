package com.library.Enum;

/**
 * 返回状态码
 */
public enum ResultCode {

    SUCCESS("200","成功"),
    FAIL("500","失败");

    public final String code;

    public final String desc;

    ResultCode(String code,String desc){
    this.code = code;
    this.desc = desc;
    }
}
