package com.library.service;

import com.library.pojo.ReaderCard;

public interface ReaderCardService {

    public boolean addReaderCard(Long readerId,String sno, String password);
    public boolean updatePassword(long readerId, String password);

    public boolean deleteReaderCard(long readerId);

    public boolean deleteReaderCardByReaderId(long readerId);

    public ReaderCard getReaderCardBySno(long readerId);
}
