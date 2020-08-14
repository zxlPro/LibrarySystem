package com.library.service;

import com.library.pojo.ReaderInfo;

public interface ReaderCardService {

    public boolean addReaderCard(ReaderInfo readerInfo, String password);
    public boolean updatePassword(long readerId, String password);

    public boolean deleteReaderCard(long readerId);
}
