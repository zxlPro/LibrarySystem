package com.library.service;

import com.github.pagehelper.PageInfo;
import com.library.pojo.BookInfo;
import com.library.vo.BookInfoVo;

public interface BookService {


    public PageInfo<BookInfo> queryBook(BookInfoVo vo);

    public boolean matchBook(BookInfoVo vo);

    public boolean addBook(BookInfo bookInfo);
    public BookInfo getBook(Long bookId);

    public boolean editBook(BookInfo book);

    public boolean deleteBook(Long bookId);

}
