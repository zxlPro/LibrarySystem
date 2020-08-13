package com.library.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.library.mapper.ReaderCardMapper;
import com.library.mapper.ReaderInfoMapper;
import com.library.pojo.ReaderCard;
import com.library.pojo.ReaderInfo;
import com.library.pojo.ReaderInfoExample;
import com.library.vo.ReaderInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReaderInfoService {
    @Autowired
    private ReaderInfoMapper readerInfoMapper;
    @Autowired
    private ReaderCardMapper readerCardMapper;


    public List<ReaderInfo> readerInfos() {
        ReaderInfoExample example = new ReaderInfoExample();
        return readerInfoMapper.selectByExample(example);
    }


    /**
     * 查询读者列表
     * @param vo
     * @return
     */
    public PageInfo<ReaderInfo> getReaderList(ReaderInfoVo vo) {
        ReaderInfoExample example = new ReaderInfoExample();
        PageHelper.startPage(vo.getPageNo(),vo.getPageSize());
        List<ReaderInfo> readerInfoList = readerInfoMapper.selectByExample(example);
        PageInfo<ReaderInfo> pageInfo = new PageInfo<>(readerInfoList);
        return pageInfo;
    }

    public boolean deleteReaderInfo(long readerId) {
        return readerInfoMapper.deleteByPrimaryKey(readerId) > 0;
    }

    public ReaderInfo getReaderInfo(long readerId) {
        return readerInfoMapper.selectByPrimaryKey(readerId);
    }

    public boolean editReaderInfo(ReaderInfo readerInfo) {
        return readerInfoMapper.updateByPrimaryKeySelective(readerInfo) > 0;
    }

    public boolean editReaderCard(ReaderInfo readerInfo) {
        ReaderCard readerCard = new ReaderCard();
        readerCard.setReaderId(readerInfo.getReaderId());
        readerCard.setUsername(readerInfo.getName());
        return readerCardMapper.updateByPrimaryKeySelective(readerCard) > 0;
    }

    public long addReaderInfo(ReaderInfo readerInfo) {
        return readerInfoMapper.insertSelective(readerInfo);
    }
}
