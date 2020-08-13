package com.library.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.library.mapper.LendListMapper;
import com.library.mapper.ext.BookInfoExtMapper;
import com.library.mapper.ext.LendListExtMapper;
import com.library.pojo.LendList;
import com.library.pojo.LendListExample;
import com.library.vo.LendListVo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class LendService {
    @Autowired
    private LendListMapper lendListMapper;

    @Autowired
    private LendListExtMapper LendListExtMapper;

    @Autowired
    private BookInfoExtMapper bookInfoExtMapper;

    public boolean returnBook(long bookId, long readerId){
        LendListExample example = new LendListExample();
        example.createCriteria().andBookIdEqualTo(bookId).andReaderIdEqualTo(readerId);
        LendList lendList = new LendList();
        lendList.setBackDate(new Date());
        return lendListMapper.updateByExampleSelective(lendList,example)>0 && bookInfoExtMapper.addBookNum(bookId)>0;
    }

    public boolean lendBook(long bookId,long readerId){
        LendList lendList = new LendList();
        lendList.setLendDate(new Date());
        lendList.setBookId(bookId);
        lendList.setReaderId(readerId);
        return lendListMapper.insertSelective(lendList)>0 && bookInfoExtMapper.delBookNum(bookId)>0;
    }

    public List<LendListVo> lendList(LendListVo vo){
        return LendListExtMapper.getLendList(vo);
    }

    /**
     * 查询借阅记录
     * @param vo
     * @return
     */
    public PageInfo<LendListVo> getLendList(LendListVo vo){
        PageHelper.startPage(vo.getPageNo(),vo.getPageSize());
        List<LendListVo> list = LendListExtMapper.getLendList(vo);
        PageInfo<LendListVo> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    public int deleteLend(long serNum) {
        return lendListMapper.deleteByPrimaryKey(serNum);
    }

}
