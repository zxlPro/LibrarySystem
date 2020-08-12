package com.library.mapper.ext;

import com.library.vo.LendListVo;

import java.util.List;

public interface LendListExtMapper {
    List<LendListVo> getLendList(LendListVo vo);
}