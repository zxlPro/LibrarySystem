package com.library.service.impl;

import com.library.mapper.AdminMapper;
import com.library.mapper.ReaderCardMapper;
import com.library.mapper.ext.ReaderCardExtMapper;
import com.library.pojo.Admin;
import com.library.pojo.AdminExample;
import com.library.pojo.ReaderCard;
import com.library.pojo.ReaderCardExample;
import com.library.service.LoginService;
import com.library.vo.ReaderCardVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.util.HashMap;
import java.util.Map;

@Service("loginService")
public class LoginServiceImpl implements LoginService {

    @Autowired
    private ReaderCardMapper readerCardMapper;
    @Autowired
    private AdminMapper adminMapper;

    @Autowired
    private ReaderCardExtMapper readerCardExtMapper;

    public boolean hasMatchReader(String sno,String password){
        String passwdMd5 = DigestUtils.md5DigestAsHex(password.getBytes());
        ReaderCardExample example = new ReaderCardExample();
        example.createCriteria().andSnoEqualTo(sno).andPasswordEqualTo(passwdMd5);
        return  readerCardMapper.countByExample(example)>0;
    }

    public String getAdminUsername(long adminId) {
        return adminMapper.selectByPrimaryKey(adminId).getUsername();
    }

    public ReaderCard findReaderCardByReaderId(String sno){
        ReaderCardVo vo = new ReaderCardVo();
        vo.setSno(sno);
        return readerCardExtMapper.getReaderCard(vo);
    }

    public boolean hasMatchAdmin(String adminId,String password){
        String passwdMd5 = DigestUtils.md5DigestAsHex(password.getBytes());
        AdminExample example = new AdminExample();
        example.createCriteria().andAdminIdEqualTo(Long.valueOf(adminId)).andPasswordEqualTo(passwdMd5);
        return adminMapper.countByExample(example) == 1;
    }

    public boolean adminRePassword(long adminId, String newPassword){
        Admin admin = new Admin();
        String passwdMd5 = DigestUtils.md5DigestAsHex(newPassword.getBytes());
        admin.setPassword(passwdMd5);
        admin.setAdminId(adminId);
        return adminMapper.updateByPrimaryKeySelective(admin)>0;
    }
    public String getAdminPassword(long adminId){
        return adminMapper.selectByPrimaryKey(adminId).getPassword();
    }

    public boolean readerRePassword(String sno, String newPassword) {
        String passwdMd5 = DigestUtils.md5DigestAsHex(newPassword.getBytes());
        ReaderCard readerCard = new ReaderCard();
        readerCard.setPassword(passwdMd5);
        readerCard.setSno(sno);
        return readerCardMapper.updateByPrimaryKeySelective(readerCard) > 0;
    }

    public String getReaderPassword(String sno) {
        return readerCardMapper.selectByPrimaryKey(sno).getPassword();
    }

    @Override
    public Map<String, Object> login(Long id, String passwd) {
//        String passwdMd5 = DigestUtils.md5DigestAsHex(passwd.getBytes());
//        boolean isReader = hasMatchReader(id, passwdMd5);
//        boolean isAdmin = hasMatchAdmin(id, passwdMd5);
//        HashMap<String, String> res = new HashMap<>();
//        if (isAdmin) {
//            Admin admin = new Admin();
//            admin.setAdminId(id);
//            admin.setPassword(passwd);
//            String username = getAdminUsername(id);
//            admin.setUsername(username);
//            request.getSession().setAttribute("admin", admin);
//            res.put("stateCode", "1");
//            res.put("msg", "管理员登陆成功！");
//        } else if (isReader) {
//            ReaderCard readerCard = findReaderCardByReaderId(id);
//            request.getSession().setAttribute("readercard", readerCard);
//            res.put("stateCode", "2");
//            res.put("msg", "读者登陆成功！");
//        } else {
//            res.put("stateCode", "0");
//            res.put("msg", "账号或密码错误！");
//        }


        return null;
    }


    public static void main(String[] args) {
        String passwdMd5 = DigestUtils.md5DigestAsHex("123456".getBytes());
        System.out.println(passwdMd5);
    }

}
