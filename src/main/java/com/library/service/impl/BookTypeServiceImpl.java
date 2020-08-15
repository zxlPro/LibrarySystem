package com.library.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.library.mapper.BookTypeMapper;
import com.library.pojo.BookType;
import com.library.pojo.BookTypeExample;
import com.library.pojo.ReaderType;
import com.library.pojo.ReaderTypeExample;
import com.library.service.BookTypeService;
import com.library.vo.BookTypeVo;
import com.library.vo.RespResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 图书分类Service
 */
@Service("bookTypeService")
public class BookTypeServiceImpl implements BookTypeService {

    @Autowired
    private BookTypeMapper bookTypeMapper;

    /**
     * 查询所有图书分类
     * @return
     */
    public RespResult getAllBookTypeList(BookTypeVo vo){
        RespResult result = new RespResult();
        BookTypeExample example = new BookTypeExample();
        PageHelper.startPage(vo.getPageNo(),vo.getPageSize());
        List<BookType> bookTypeList = bookTypeMapper.selectByExample(example);
        PageInfo<BookType> pageInfo = new PageInfo<>(bookTypeList);
        result.success(pageInfo);
        return result;
    };

    /**
     * 添加图书分类
     * @param type
     * @return
     */
    public RespResult insertBookType(BookType type){
        RespResult result = new RespResult();
        BookTypeExample example = new BookTypeExample();
        example.createCriteria().andTypeNameEqualTo(type.getTypeName());
        List<BookType> list = bookTypeMapper.selectByExample(example);
        if(list.isEmpty()){
            bookTypeMapper.insert(type);
            result.success(null);
        }else{
            result.fail(null,"图书分类已存在");
        }
        return result;
    }

    /**
     * 删除图书分类
     * @param id
     * @return
     */
    public RespResult deleteBookType(String id){
        RespResult result = new RespResult();
        bookTypeMapper.deleteByPrimaryKey(Long.valueOf(id));
        result.success(null);
        return result;
    }

    /**
     * 修改图书分类
     * @param type
     * @return
     */
    public RespResult updateBookType(BookType type){
        RespResult result = new RespResult();
        //更新时先查询除了本身之外是否有其他的图书分类叫新改的名字
        BookTypeExample example = new BookTypeExample();
        example.createCriteria().andTypeNameEqualTo(type.getTypeName()).andIdNotEqualTo(type.getId());
        List<BookType> list = bookTypeMapper.selectByExample(example);
        //如果没有则更新，否则返回图书分类已存在
        if(list.isEmpty()){
            bookTypeMapper.updateByPrimaryKeySelective(type);
            result.success(null);
        }else{
            result.fail(null,"图书分类已存在");
        }
        return result;
    }


}
