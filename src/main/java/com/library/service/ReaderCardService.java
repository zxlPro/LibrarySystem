package com.library.service;

import com.library.pojo.ReaderCard;

public interface ReaderCardService {

    public boolean addReaderCard(Long readerId,String sno, String password);
    public boolean updatePassword(String sno, String password);

    public boolean deleteReaderCard(String sno);

    public boolean deleteReaderCardByReaderId(long readerId);

    public ReaderCard getReaderCardBySno(String sno);
}
