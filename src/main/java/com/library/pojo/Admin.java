package com.library.pojo;

public class Admin {
    private Long adminId;

    private String password;

    private String username;

    public Admin(Long adminId, String password, String username) {
        this.adminId = adminId;
        this.password = password;
        this.username = username;
    }

    public Admin() {
        super();
    }

    public Long getAdminId() {
        return adminId;
    }

    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }
}