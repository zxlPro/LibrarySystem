package com.library.controller;

import com.library.pojo.BookType;
import com.library.service.BookTypeService;
import com.library.vo.BookTypeVo;
import com.library.vo.RespResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BookTypeController {

    @Autowired
    private BookTypeService bookTypeService;

    /**
     * 添加读者类型
     * @param type
     * @return
     */
    @RequestMapping("addBookType")
    @ResponseBody
    public RespResult addBookType(BookType type){

        return  bookTypeService.insertBookType(type);
    }

    /**
     * 修改读者类型
     * @param BookType
     * @return
     */
    @RequestMapping("updateBookType")
    @ResponseBody
    public RespResult updateBookType(BookType BookType){
        return bookTypeService.updateBookType(BookType);
    }

    /**
     * 删除读者类型
     * @param id
     * @return
     */
    @RequestMapping("deleteBookType")
    @ResponseBody
    public RespResult deleteBookType(String id){
        return bookTypeService.deleteBookType(id);
    }

    /**
     * 查询读者类型
     * @return
     */
    @RequestMapping("getBookTypeList")
    @ResponseBody
    public RespResult getBookTypeList(BookTypeVo vo){
        return bookTypeService.getAllBookTypeList(vo);
    }
}
