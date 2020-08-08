package com.library.pojo;

public class ReaderCard {
    private Long readerId;

    private String username;

    private String password;

    public ReaderCard(Long readerId, String username, String password) {
        this.readerId = readerId;
        this.username = username;
        this.password = password;
    }

    public ReaderCard() {
        super();
    }

    public Long getReaderId() {
        return readerId;
    }

    public void setReaderId(Long readerId) {
        this.readerId = readerId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}