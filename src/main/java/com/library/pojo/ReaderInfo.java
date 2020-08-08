package com.library.pojo;

import java.util.Date;

public class ReaderInfo {
    private Long readerId;

    private String name;

    private String sex;

    private Date birth;

    private String address;

    private String phone;

    public ReaderInfo(Long readerId, String name, String sex, Date birth, String address, String phone) {
        this.readerId = readerId;
        this.name = name;
        this.sex = sex;
        this.birth = birth;
        this.address = address;
        this.phone = phone;
    }

    public ReaderInfo() {
        super();
    }

    public Long getReaderId() {
        return readerId;
    }

    public void setReaderId(Long readerId) {
        this.readerId = readerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }
}