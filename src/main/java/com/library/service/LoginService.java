package com.library.service;

import com.library.pojo.ReaderCard;

public interface LoginService {

    public boolean hasMatchReader(long readerId,String password);

    public String getAdminUsername(long adminId);

    public ReaderCard findReaderCardByReaderId(long readerId);

    public boolean hasMatchAdmin(long adminId,String password);

    public boolean adminRePassword(long adminId, String newPassword);
    public String getAdminPassword(long adminId);

    public boolean readerRePassword(long readerId, String newPassword) ;

    public String getReaderPassword(long readerId) ;


}
