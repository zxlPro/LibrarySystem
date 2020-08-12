package com.library.vo;

import com.library.Enum.ResultCode;
import lombok.Data;

import java.io.Serializable;

/**
 * 响应实体类
 */
@Data
public class RespResult implements Serializable {

    /**
     * 返回数据
     */
    private Object data;
    /**
     * 当前页
     */
    private Integer pageNo;

    /**
     * 每页多少条
     */
    private Integer pageSize;

    /**
     * 返回响应码
     */
    private String resultCode;

    /**
     * 返回信息
     */
    private String resultMsg;


    public void success(Object data){
        this.resultCode = ResultCode.SUCCESS.code;
        this.data = data;
    }

    public void fail(Object data,String resultMsg){
        this.resultCode = ResultCode.FAIL.code;
        this.data = data;
        this.resultMsg = resultMsg;
    }

}
