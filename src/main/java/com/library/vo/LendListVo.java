package com.library.vo;

import com.library.pojo.LendList;
import lombok.Data;

@Data
public class LendListVo extends LendList {

    /**
     * 书名
     */
    private String bookName;

    /**
     * 读者名称
     */
    private String readerName;

}