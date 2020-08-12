package com.library.vo;

import com.library.pojo.BookInfo;
import lombok.Data;

@Data
public class BookInfoVo extends BookInfo {

 private Integer pageNo = 1;

 private Integer pageSize = 10;
}
