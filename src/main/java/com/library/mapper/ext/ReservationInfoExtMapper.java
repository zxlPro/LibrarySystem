package com.library.mapper.ext;

import com.library.vo.ReservationInfoVo;

import java.util.List;

public interface ReservationInfoExtMapper {


    List<ReservationInfoVo> getReservationInfoList(ReservationInfoVo vo);
}
