package com.library.service;

import com.library.pojo.ReaderCard;

import java.util.Map;

public interface LoginService {

    public boolean hasMatchReader(long readerId,String password);

    public String getAdminUsername(long adminId);

    public ReaderCard findReaderCardByReaderId(long readerId);

    public boolean hasMatchAdmin(String adminId,String password);

    public boolean adminRePassword(long adminId, String newPassword);
    public String getAdminPassword(long adminId);

    public boolean readerRePassword(long readerId, String newPassword) ;

    public String getReaderPassword(long readerId) ;


    Map<String, Object>  login(Long id, String passwd);

}
