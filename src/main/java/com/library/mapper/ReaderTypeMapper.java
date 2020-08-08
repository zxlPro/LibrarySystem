package com.library.mapper;

import com.library.pojo.ReaderType;
import com.library.pojo.ReaderTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReaderTypeMapper {
    int countByExample(ReaderTypeExample example);

    int deleteByExample(ReaderTypeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ReaderType record);

    int insertSelective(ReaderType record);

    List<ReaderType> selectByExample(ReaderTypeExample example);

    ReaderType selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ReaderType record, @Param("example") ReaderTypeExample example);

    int updateByExample(@Param("record") ReaderType record, @Param("example") ReaderTypeExample example);

    int updateByPrimaryKeySelective(ReaderType record);

    int updateByPrimaryKey(ReaderType record);
}