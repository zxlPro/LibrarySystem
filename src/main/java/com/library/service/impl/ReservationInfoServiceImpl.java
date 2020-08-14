package com.library.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.library.Enum.ReservationStatus;
import com.library.mapper.ReservationInfoMapper;
import com.library.mapper.ext.BookInfoExtMapper;
import com.library.mapper.ext.ReaderInfoExtMapper;
import com.library.mapper.ext.ReservationInfoExtMapper;
import com.library.pojo.ReservationInfo;
import com.library.service.ReservationInfoService;
import com.library.vo.ReaderInfoVo;
import com.library.vo.ReservationInfoVo;
import com.library.vo.RespResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service("reservationInfoService")
public class ReservationInfoServiceImpl implements ReservationInfoService {


    @Autowired
    BookInfoExtMapper bookInfoExtMapper;

    @Autowired
    ReservationInfoMapper reservationInfoMapper;

    @Autowired
    ReservationInfoExtMapper reservationInfoExtMapper;

    @Autowired
    ReaderInfoExtMapper readerInfoExtMapper;

    /**
     * 预约图书
     * @param readerId
     * @param bookId
     * @return
     */
    @Transactional
    public boolean appointment(String readerId,String bookId){
        boolean resultFlag = false;
        //减去书的库存
        int num = bookInfoExtMapper.delBookNum(Long.valueOf(bookId));
        //如果有数据更新则为成功预约
        if(num>0){
            //拼装预约参数
            ReservationInfo info = new ReservationInfo();
            //设置图书编号
            info.setBookId(Long.valueOf(bookId));
            //设置读者编号
            info.setReaderId(Long.valueOf(readerId));
            //设置借阅时间
            info.setReserDate(new Date());
            //设置超时时间
            info.setTimeOutDate(getOutTime(readerId,info.getReserDate()));
            //初始化预约为有效
            info.setReserStatus(ReservationStatus.INVALID.value);
            //保存预约参数
            reservationInfoMapper.insert(info);
            resultFlag = true;
        }
        return resultFlag;
    }

    /**
     * 获取预约超时时间
     * @param readerId
     * @param reserDate
     * @return
     */
    private Date getOutTime(String readerId,Date reserDate){
        ReaderInfoVo vo  = new ReaderInfoVo();
        vo.setReaderId(Long.valueOf(readerId));
        //根据读者Id查询出 读者预约的超时时间
        List<ReaderInfoVo> readerList = readerInfoExtMapper.getReaderList(vo);
        //以下为计算预约超时时间
        int days = readerList.get(0).getReservateionDays();
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(reserDate);
        calendar.set(Calendar.DAY_OF_MONTH,calendar.get(Calendar.DAY_OF_MONTH)+days);
        return calendar.getTime();
    }

    /**
     * 取消预约
     * @param id
     * @return
     */
    @Transactional
    public boolean cancelAppointment(String id){
        //根据预约Id查询预约记录
        ReservationInfo info = reservationInfoMapper.selectByPrimaryKey(Long.valueOf(id));
        //取消预约将书的数量+1
        int num = bookInfoExtMapper.addBookNum(Long.valueOf(info.getBookId()));
        //将预约信息置为失效
        info.setReserStatus(ReservationStatus.INVALID.value);
        reservationInfoMapper.updateByPrimaryKeySelective(info);
        return true;
    }

    /**
     * 获取预约列表
     * @param vo
     * @return
     */
    public RespResult getReservationList(ReservationInfoVo vo){
        //设置分页参数
        PageHelper.startPage(vo.getPageNo(),vo.getPageSize());
        //根据条件查询预约记录
        List<ReservationInfoVo> list = reservationInfoExtMapper.getReservationInfoList(vo);
        //设置分页结果
        PageInfo<ReservationInfoVo> pageInfo = new PageInfo<>(list);
        //拼装返回参数
        RespResult result = new RespResult();
        result.success(pageInfo);
        return result;
    }

}
