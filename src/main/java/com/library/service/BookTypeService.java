package com.library.service;

import com.library.pojo.BookType;
import com.library.vo.RespResult;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 图书分类Service
 */
@Service
public interface BookTypeService {

    /**
     * 查询所有图书分类
     * @return
     */
    public List<BookType> getAllBookTypeList();

    /**
     * 添加图书分类
     * @param type
     * @return
     */
    public RespResult insertBookType(BookType type);

    /**
     * 删除图书分类
     * @param id
     * @return
     */
    public RespResult deleteBookType(String id);

    /**
     * 修改图书分类
     * @param type
     * @return
     */
    public RespResult updateBookType(BookType type);


}
