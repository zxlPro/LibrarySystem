package com.library.Enum;

/**
 * 预约状态码
 */
public enum ReservationStatus {

    VALID("0","有效"),
    INVALID("1","失败"),
    TIME_OUT("2","超时");

    public final String value;

    public final String desc;

    ReservationStatus(String value, String desc){
        this.value = value;
        this.desc = desc;
    }
}
