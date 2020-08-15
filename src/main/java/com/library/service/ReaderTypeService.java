package com.library.service;

import com.library.pojo.ReaderType;
import com.library.vo.ReaderTypeVo;
import com.library.vo.RespResult;

public interface ReaderTypeService {

    /**
     * 查询所有读者分类
     * @return
     */
    public RespResult getAllReaderTypeList(ReaderTypeVo vo);


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
