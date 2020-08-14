package com.library.vo;

import lombok.Data;

@Data
public class ReservationInfoVo {
    private int pageNo = 1;

    private int pageSize = 10;

    private String bookName;

    private String readerName;

}
