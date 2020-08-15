package com.library.service;

import com.library.pojo.ReaderCard;

import java.util.Map;

public interface LoginService {

    public boolean hasMatchReader(String sno,String password);

    public String getAdminUsername(long adminId);

    public ReaderCard findReaderCardByReaderId(String sno);

    public boolean hasMatchAdmin(String adminId,String password);

    public boolean adminRePassword(long adminId, String newPassword);
    public String getAdminPassword(long adminId);

    public boolean readerRePassword(String sno, String newPassword) ;

    public String getReaderPassword(String sno) ;


    Map<String, Object>  login(Long id, String passwd);

}
