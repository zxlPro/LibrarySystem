package com.library.service;

import com.library.pojo.ReaderType;
import com.library.vo.RespResult;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ReaderTypeService {

    /**
     * 查询所有读者分类
     * @return
     */
    public List<ReaderType> getAllReaderTypeList();


    /**
     * 添加读者分类
     * @param type
     * @return
     */
    public RespResult insertReaderType(ReaderType type);

    /**
     * 删除读者分类
     * @param id
     * @return
     */
    public RespResult deleteReaderType(String id);

    /**
     * 修改图书分类
     * @param type
     * @return
     */
    public RespResult updateReaderType(ReaderType type);


}
