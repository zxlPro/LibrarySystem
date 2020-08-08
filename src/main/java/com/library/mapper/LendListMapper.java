package com.library.mapper;

import com.library.pojo.LendList;
import com.library.pojo.LendListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LendListMapper {
    int countByExample(LendListExample example);

    int deleteByExample(LendListExample example);

    int deleteByPrimaryKey(Long serNum);

    int insert(LendList record);

    int insertSelective(LendList record);

    List<LendList> selectByExample(LendListExample example);

    LendList selectByPrimaryKey(Long serNum);

    int updateByExampleSelective(@Param("record") LendList record, @Param("example") LendListExample example);

    int updateByExample(@Param("record") LendList record, @Param("example") LendListExample example);

    int updateByPrimaryKeySelective(LendList record);

    int updateByPrimaryKey(LendList record);
}