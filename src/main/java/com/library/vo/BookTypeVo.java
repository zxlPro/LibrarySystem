package com.library.vo;

import com.library.pojo.BookType;
import com.library.pojo.ReaderType;
import lombok.Data;

@Data
public class BookTypeVo extends BookType {

    private Integer pageNo = 1;

    private Integer pageSize = 10;

}