package com.library.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.library.mapper.ReaderCardMapper;
import com.library.mapper.ReaderInfoMapper;
import com.library.mapper.ext.ReaderInfoExtMapper;
import com.library.pojo.ReaderCard;
import com.library.pojo.ReaderInfo;
import com.library.pojo.ReaderInfoExample;
import com.library.service.ReaderInfoService;
import com.library.vo.ReaderInfoVo;
import com.library.vo.RespResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.DigestUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service("readerInfoService")
public class ReaderInfoServiceImpl implements ReaderInfoService {
    @Autowired
    private ReaderInfoMapper readerInfoMapper;
    @Autowired
    private ReaderInfoExtMapper readerInfoExtMapper;
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
    public PageInfo<ReaderInfoVo> getReaderList(ReaderInfoVo vo) {
        PageHelper.startPage(vo.getPageNo(),vo.getPageSize());
        List<ReaderInfoVo> readerInfoList = readerInfoExtMapper.getReaderList(vo);
        PageInfo<ReaderInfoVo> pageInfo = new PageInfo<>(readerInfoList);
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
        return readerCardMapper.updateByPrimaryKeySelective(readerCard) > 0;
    }

    @Transactional
    public RespResult addReaderInfo(String sno,String name, String sex, String birth, String phone, String password) {
        RespResult result = new RespResult();
        //判断学号是否已经存在
        ReaderCard card = readerCardMapper.selectByPrimaryKey(sno);
        //学号不存在则创建读者信息
        if(card == null){
            ReaderInfo readerInfo = buildReaderInfo(0, name, sex, birth, phone);
            readerInfoMapper.insertSelective(readerInfo);
            long  readerId = readerInfo.getReaderId();
            readerCardMapper.insertSelective(buildReaderCard(password,readerId,sno));
        }else{
            //学号存在则返回读者信息已存在
           result.setResultMsg("读者信息已存在");
        }
        result.setResultMsg("添加读者信息成功");
        return result;
    }

    private  ReaderCard buildReaderCard(String password,long readerId,String sno){
        String passwdMd5 = DigestUtils.md5DigestAsHex(password.getBytes());
        ReaderCard readerCard = new ReaderCard();
        readerCard.setReaderId(readerId);
        readerCard.setSno(sno);
        readerCard.setPassword(passwdMd5);
        return readerCard;
    }

    private ReaderInfo buildReaderInfo(long readerId, String name, String sex, String birth, String phone) {
        ReaderInfo readerInfo = new ReaderInfo();
        Date date = new Date();
        try {
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            date = df.parse(birth);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        readerInfo.setName(name);
        readerInfo.setReaderId(readerId);
        readerInfo.setPhone(phone);
        readerInfo.setSex(sex);
        readerInfo.setBirth(date);
        return readerInfo;
    }
}
