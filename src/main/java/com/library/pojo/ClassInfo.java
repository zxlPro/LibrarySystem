package com.library.pojo;

public class ClassInfo {
    private Integer classId;

    private String className;

    public ClassInfo(Integer classId, String className) {
        this.classId = classId;
        this.className = className;
    }

    public ClassInfo() {
        super();
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }
}