package com.library.service;

import com.library.vo.ReservationInfoVo;
import com.library.vo.RespResult;

public interface ReservationInfoService {

    /**
     * 预约图书
     * @param readerId
     * @param bookId
     * @return
     */
    public boolean appointment(String readerId,String bookId);

    /**
     * 取消预约
     * @param id
     * @return
     */
    public boolean cancelAppointment(String id);

    /**
     * 获取预约列表
     * @param vo
     * @return
     */
    public RespResult getReservationList(ReservationInfoVo vo);

}
