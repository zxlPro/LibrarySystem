package com.library.controller;

import com.library.pojo.ReaderType;
import com.library.service.ReaderTypeService;
import com.library.vo.ReaderTypeVo;
import com.library.vo.RespResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ReaderTypeController {

    @Autowired
    private ReaderTypeService readerTypeService;

    /**
     * 添加读者类型
     * @param readerType
     * @return
     */
    @RequestMapping("addReaderType")
    @ResponseBody
    public RespResult addReaderType(ReaderType readerType){

       return  readerTypeService.insertReaderType(readerType);
    }

    /**
     * 修改读者类型
     * @param readerType
     * @return
     */
    @RequestMapping("updateReaderType")
    @ResponseBody
    public RespResult updateReaderType(ReaderType readerType){
        return readerTypeService.updateReaderType(readerType);
    }

    /**
     * 删除读者类型
     * @param id
     * @return
     */
    @RequestMapping("deleteReaderType")
    @ResponseBody
    public RespResult deleteReaderType(String id){
        return readerTypeService.deleteReaderType(id);
    }

    /**
     * 查询读者类型
     * @return
     */
    @RequestMapping("getReaderTypeList")
    @ResponseBody
    public RespResult getReaderTypeList(ReaderTypeVo vo){
        return readerTypeService.getAllReaderTypeList(vo);
    }
}
