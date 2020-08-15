package com.library.vo;

import com.library.pojo.ReaderType;
import lombok.Data;

@Data
public class ReaderTypeVo extends ReaderType {

    private Integer pageNo = 1;

    private Integer pageSize = 10;

}