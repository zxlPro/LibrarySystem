package com.library.service;

import com.github.pagehelper.PageInfo;
import com.library.pojo.ReaderInfo;
import com.library.vo.ReaderInfoVo;
import com.library.vo.RespResult;

import java.util.List;

public interface ReaderInfoService {

    public List<ReaderInfo> readerInfos() ;


    /**
     * 查询读者列表
     * @param vo
     * @return
     */
    public PageInfo<ReaderInfoVo> getReaderList(ReaderInfoVo vo) ;

    public boolean deleteReaderInfo(long readerId);

    public ReaderInfo getReaderInfo(long readerId) ;

    public boolean editReaderInfo(ReaderInfo readerInfo) ;

    public boolean editReaderCard(ReaderInfo readerInfo);

    public RespResult addReaderInfo(String sno, String name, String sex, String birth, String phone, String password);
}
