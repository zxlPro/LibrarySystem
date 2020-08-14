package com.library.service;

import com.github.pagehelper.PageInfo;
import com.library.vo.LendListVo;

import java.util.List;

public interface LendService {

    public boolean returnBook(long bookId, long readerId);

    public boolean lendBook(long bookId,long readerId);

    public List<LendListVo> lendList(LendListVo vo);

    /**
     * 查询借阅记录
     * @param vo
     * @return
     */
    public PageInfo<LendListVo> getLendList(LendListVo vo);

    public int deleteLend(long serNum);

}
