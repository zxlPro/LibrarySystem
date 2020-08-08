package com.library.pojo;

import java.util.Date;

public class ReservationInfo {
    private Long id;

    private Long bookId;

    private Long userId;

    private String bookStatus;

    private Date reserDate;

    private String reserStatus;

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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(String bookStatus) {
        this.bookStatus = bookStatus == null ? null : bookStatus.trim();
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
}