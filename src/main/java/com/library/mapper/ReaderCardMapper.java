package com.library.mapper;

import com.library.pojo.ReaderCard;
import com.library.pojo.ReaderCardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReaderCardMapper {
    int countByExample(ReaderCardExample example);

    int deleteByExample(ReaderCardExample example);

    int deleteByPrimaryKey(Long readerId);

    int insert(ReaderCard record);

    int insertSelective(ReaderCard record);

    List<ReaderCard> selectByExample(ReaderCardExample example);

    ReaderCard selectByPrimaryKey(Long readerId);

    int updateByExampleSelective(@Param("record") ReaderCard record, @Param("example") ReaderCardExample example);

    int updateByExample(@Param("record") ReaderCard record, @Param("example") ReaderCardExample example);

    int updateByPrimaryKeySelective(ReaderCard record);

    int updateByPrimaryKey(ReaderCard record);
}