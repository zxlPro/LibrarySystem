package com.library.vo;

import lombok.Data;

import java.util.Date;

@Data
public class LendListVo {
    private Long serNum;

    private Long bookId;

    private Long readerId;

    private Date lendDate;

    private Date backDate;

}