package com.library.pojo;

public class ReaderType {
    private Long id;

    private String readerTypeName;

    private Integer lendBookNum;

    private Integer lendDays;

    private Integer reservationDays;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReaderTypeName() {
        return readerTypeName;
    }

    public void setReaderTypeName(String readerTypeName) {
        this.readerTypeName = readerTypeName == null ? null : readerTypeName.trim();
    }

    public Integer getLendBookNum() {
        return lendBookNum;
    }

    public void setLendBookNum(Integer lendBookNum) {
        this.lendBookNum = lendBookNum;
    }

    public Integer getLendDays() {
        return lendDays;
    }

    public void setLendDays(Integer lendDays) {
        this.lendDays = lendDays;
    }

    public Integer getReservationDays() {
        return reservationDays;
    }

    public void setReservationDays(Integer reservationDays) {
        this.reservationDays = reservationDays;
    }
}