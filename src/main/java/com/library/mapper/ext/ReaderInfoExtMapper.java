package com.library.mapper.ext;

import com.library.vo.ReaderInfoVo;

import java.util.List;

public interface ReaderInfoExtMapper {
    List<ReaderInfoVo> getReaderList(ReaderInfoVo vo);
}