package com.library.service.impl;

import com.library.mapper.ReaderCardMapper;
import com.library.pojo.ReaderCard;
import com.library.pojo.ReaderCardExample;
import com.library.service.ReaderCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

@Service("readerCardService")
public class ReaderCardServiceImpl implements ReaderCardService {
    @Autowired
    private ReaderCardMapper readerCardMapper;

    public boolean addReaderCard(Long readerId,String sno, String password){
        String passwdMd5 = DigestUtils.md5DigestAsHex(password.getBytes());
        ReaderCard readerCard = new ReaderCard();
        readerCard.setReaderId(readerId);
        readerCard.setPassword(passwdMd5);
        return  readerCardMapper.insertSelective(readerCard)>0;
    }
    public boolean updatePassword(long readerId, String password){
        String passwdMd5 = DigestUtils.md5DigestAsHex(password.getBytes());
        ReaderCard readerCard = new ReaderCard();
        readerCard.setPassword(passwdMd5);
        readerCard.setReaderId(readerId);
        return readerCardMapper.updateByPrimaryKeySelective(readerCard)>0;
    }

    public boolean deleteReaderCard(long readerId) {
        return readerCardMapper.deleteByPrimaryKey(readerId) > 0;
    }

    public boolean deleteReaderCardByReaderId(long readerId) {
        ReaderCardExample example = new ReaderCardExample();
        example.createCriteria().andReaderIdEqualTo(readerId);
        return readerCardMapper.deleteByExample(example) > 0;
    }

    @Override
    public ReaderCard getReaderCardBySno(long readerId) {
        return readerCardMapper.selectByPrimaryKey(readerId);
    }
}
