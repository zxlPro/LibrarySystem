package com.library.pojo;

import java.util.Date;

public class LendList {
    private Long serNum;

    private Long bookId;

    private Long readerId;

    private Date lendDate;

    private Date backDate;

    public LendList(Long serNum, Long bookId, Long readerId, Date lendDate, Date backDate) {
        this.serNum = serNum;
        this.bookId = bookId;
        this.readerId = readerId;
        this.lendDate = lendDate;
        this.backDate = backDate;
    }

    public LendList() {
        super();
    }

    public Long getSerNum() {
        return serNum;
    }

    public void setSerNum(Long serNum) {
        this.serNum = serNum;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public Long getReaderId() {
        return readerId;
    }

    public void setReaderId(Long readerId) {
        this.readerId = readerId;
    }

    public Date getLendDate() {
        return lendDate;
    }

    public void setLendDate(Date lendDate) {
        this.lendDate = lendDate;
    }

    public Date getBackDate() {
        return backDate;
    }

    public void setBackDate(Date backDate) {
        this.backDate = backDate;
    }
}