package com.library.service;

import com.github.pagehelper.PageInfo;
import com.library.pojo.ReaderInfo;
import com.library.vo.ReaderInfoVo;

import java.util.List;

public interface ReaderInfoService {

    public List<ReaderInfo> readerInfos() ;


    /**
     * 查询读者列表
     * @param vo
     * @return
     */
    public PageInfo<ReaderInfo> getReaderList(ReaderInfoVo vo) ;

    public boolean deleteReaderInfo(long readerId);

    public ReaderInfo getReaderInfo(long readerId) ;

    public boolean editReaderInfo(ReaderInfo readerInfo) ;

    public boolean editReaderCard(ReaderInfo readerInfo);

    public long addReaderInfo(ReaderInfo readerInfo);
}
