package com.library.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.library.mapper.ReaderTypeMapper;
import com.library.pojo.ReaderType;
import com.library.pojo.ReaderTypeExample;
import com.library.service.ReaderTypeService;
import com.library.vo.ReaderTypeVo;
import com.library.vo.RespResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("readerTypeService")
public class ReaderTypeServiceImpl implements ReaderTypeService {

    @Autowired
    private ReaderTypeMapper readerTypeMapper;

    /**
     * 查询所有读者分类
     * @return
     */
    public RespResult getAllReaderTypeList(ReaderTypeVo vo){
        RespResult result = new RespResult();
        ReaderTypeExample example = new ReaderTypeExample();
        PageHelper.startPage(vo.getPageNo(),vo.getPageSize());
       List<ReaderType> readerTypeList = readerTypeMapper.selectByExample(example);
        PageInfo<ReaderType> pageInfo = new PageInfo<>(readerTypeList);
        result.success(pageInfo);
        return result;
    }


    /**
     * 添加读者分类
     * @param type
     * @return
     */
    public RespResult insertReaderType(ReaderType type){
        RespResult result = new RespResult();
        ReaderTypeExample example = new ReaderTypeExample();
        example.createCriteria().andReaderTypeNameEqualTo(type.getReaderTypeName());
        List<ReaderType> list = readerTypeMapper.selectByExample(example);
        if(list.isEmpty()){
            readerTypeMapper.insert(type);
            result.success(null);
        }else{
            result.fail(null,"读者分类已存在");
        }
        return result;

    }

    /**
     * 删除读者分类
     * @param id
     * @return
     */
    public RespResult deleteReaderType(String id){
        RespResult result = new RespResult();
        readerTypeMapper.deleteByPrimaryKey(Long.valueOf(id));
        result.success(null);
        return result;
    }

    /**
     * 修改图书分类
     * @param type
     * @return
     */
    public RespResult updateReaderType(ReaderType type){
        RespResult result = new RespResult();
        //更新时先查询除了本身之外是否有其他的读者分类叫新改的名字
        ReaderTypeExample example = new ReaderTypeExample();
        example.createCriteria().andReaderTypeNameEqualTo(type.getReaderTypeName()).andIdNotEqualTo(type.getId());
        List<ReaderType> list = readerTypeMapper.selectByExample(example);
        //如果没有则更新，否则返回读者分类已存在
        if(list.isEmpty()){
            readerTypeMapper.updateByPrimaryKeySelective(type);
            result.success(null);
        }else{
            result.fail(null,"读者分类已存在");
        }
        return result;
    }


}
