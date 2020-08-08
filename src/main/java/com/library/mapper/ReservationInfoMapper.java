package com.library.mapper;

import com.library.pojo.ReservationInfo;
import com.library.pojo.ReservationInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReservationInfoMapper {
    int countByExample(ReservationInfoExample example);

    int deleteByExample(ReservationInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ReservationInfo record);

    int insertSelective(ReservationInfo record);

    List<ReservationInfo> selectByExample(ReservationInfoExample example);

    ReservationInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ReservationInfo record, @Param("example") ReservationInfoExample example);

    int updateByExample(@Param("record") ReservationInfo record, @Param("example") ReservationInfoExample example);

    int updateByPrimaryKeySelective(ReservationInfo record);

    int updateByPrimaryKey(ReservationInfo record);
}