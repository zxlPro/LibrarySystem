package com.library.service;

import com.library.mapper.LendListMapper;
import com.library.mapper.ext.BookInfoExtMapper;
import com.library.pojo.LendList;
import com.library.pojo.LendListExample;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vo.LendListVo;

import java.util.Date;
import java.util.List;

@Service
public class LendService {
    @Autowired
    private LendListMapper lendListMapper;

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

    public List<LendList> lendList(LendListVo vo){
        LendListExample example = new LendListExample();
        if(null != vo){
            if(StringUtils.isNotBlank(vo.getReaderId().toString())){
                example.createCriteria().andReaderIdEqualTo(vo.getReaderId());
            }
        }
        return lendListMapper.selectByExample(example);
    }

    public int deleteLend(long serNum) {
        return lendListMapper.deleteByPrimaryKey(serNum);
    }

}
