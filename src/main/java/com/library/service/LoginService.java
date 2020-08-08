package com.library.service;

import com.library.mapper.AdminMapper;
import com.library.mapper.ReaderCardMapper;
import com.library.pojo.Admin;
import com.library.pojo.AdminExample;
import com.library.pojo.ReaderCard;
import com.library.pojo.ReaderCardExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private ReaderCardMapper readerCardMapper;
    @Autowired
    private AdminMapper adminMapper;

    public boolean hasMatchReader(long readerId,String password){
        ReaderCardExample example = new ReaderCardExample();
        example.createCriteria().andReaderIdEqualTo(readerId).andPasswordEqualTo(password);
        return  readerCardMapper.countByExample(example)>0;
    }

    public String getAdminUsername(long adminId) {
        return adminMapper.selectByPrimaryKey(adminId).getUsername();
    }

    public ReaderCard findReaderCardByReaderId(long readerId){
        return readerCardMapper.selectByPrimaryKey(readerId);
    }

    public boolean hasMatchAdmin(long adminId,String password){
        AdminExample example = new AdminExample();
        example.createCriteria().andAdminIdEqualTo(adminId).andPasswordEqualTo(password);
        return adminMapper.countByExample(example) == 1;
    }

    public boolean adminRePassword(long adminId, String newPassword){
        Admin admin = new Admin();
        admin.setPassword(newPassword);
        admin.setAdminId(adminId);
        return adminMapper.updateByPrimaryKeySelective(admin)>0;
    }
    public String getAdminPassword(long adminId){
        return adminMapper.selectByPrimaryKey(adminId).getPassword();
    }

    public boolean readerRePassword(long readerId, String newPassword) {
        ReaderCard readerCard = new ReaderCard();
        readerCard.setPassword(newPassword);
        readerCard.setReaderId(readerId);
        return readerCardMapper.updateByPrimaryKeySelective(readerCard) > 0;
    }

    public String getReaderPassword(long readerId) {
        return readerCardMapper.selectByPrimaryKey(readerId).getPassword();
    }


}
