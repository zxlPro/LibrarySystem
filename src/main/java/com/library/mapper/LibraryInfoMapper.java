package com.library.mapper;

import com.library.pojo.LibraryInfo;
import com.library.pojo.LibraryInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LibraryInfoMapper {
    int countByExample(LibraryInfoExample example);

    int deleteByExample(LibraryInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LibraryInfo record);

    int insertSelective(LibraryInfo record);

    List<LibraryInfo> selectByExampleWithBLOBs(LibraryInfoExample example);

    List<LibraryInfo> selectByExample(LibraryInfoExample example);

    LibraryInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LibraryInfo record, @Param("example") LibraryInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") LibraryInfo record, @Param("example") LibraryInfoExample example);

    int updateByExample(@Param("record") LibraryInfo record, @Param("example") LibraryInfoExample example);

    int updateByPrimaryKeySelective(LibraryInfo record);

    int updateByPrimaryKeyWithBLOBs(LibraryInfo record);

    int updateByPrimaryKey(LibraryInfo record);
}