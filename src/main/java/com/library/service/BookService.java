package com.library.service;

import com.library.mapper.BookInfoMapper;
import com.library.pojo.BookInfo;
import com.library.pojo.BookInfoExample;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vo.BookInfoVo;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookInfoMapper bookInfoMapper;

    public List<BookInfo> queryBook(BookInfoVo vo) {
        BookInfoExample example = new BookInfoExample();
        if(null != vo){
            if(StringUtils.isNotBlank(vo.getName())){
                example.createCriteria().andNameLike(vo.getName());
            }
        }
        return bookInfoMapper.selectByExample(example);
    }

    public boolean matchBook(BookInfoVo vo) {
        return queryBook(vo).size() > 0;
    }

    public boolean addBook(BookInfo bookInfo) {
        return bookInfoMapper.insert(bookInfo)> 0;
    }

    public BookInfo getBook(Long bookId) {
        return bookInfoMapper.selectByPrimaryKey(bookId);
    }

    public boolean editBook(BookInfo book) {
        return bookInfoMapper.updateByPrimaryKey(book) > 0;
    }

    public boolean deleteBook(Long bookId) {
        return bookInfoMapper.deleteByPrimaryKey(bookId) > 0;
    }

}
