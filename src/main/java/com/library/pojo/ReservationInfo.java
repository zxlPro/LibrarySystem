package com.library.pojo;

import java.util.Date;

public class ReservationInfo {
    private Long id;

    private Long bookId;

    private Long readerId;

    private Date reserDate;

    private String reserStatus;

    private Date timeOutDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Date getReserDate() {
        return reserDate;
    }

    public void setReserDate(Date reserDate) {
        this.reserDate = reserDate;
    }

    public String getReserStatus() {
        return reserStatus;
    }

    public void setReserStatus(String reserStatus) {
        this.reserStatus = reserStatus == null ? null : reserStatus.trim();
    }

    public Date getTimeOutDate() {
        return timeOutDate;
    }

    public void setTimeOutDate(Date timeOutDate) {
        this.timeOutDate = timeOutDate;
    }
}