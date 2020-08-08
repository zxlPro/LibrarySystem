package com.library.pojo;

import java.util.Date;

public class BlackList {
    private Long id;

    private Long userId;

    private String blackInfo;

    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getBlackInfo() {
        return blackInfo;
    }

    public void setBlackInfo(String blackInfo) {
        this.blackInfo = blackInfo == null ? null : blackInfo.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}