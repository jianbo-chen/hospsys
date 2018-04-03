package com.cjb.pojo;

public class PatientInfo {
    private Integer id;

    private String identfyNum;

    private String phone;

    private Integer userId;

    private String sex;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdentfyNum() {
        return identfyNum;
    }

    public void setIdentfyNum(String identfyNum) {
        this.identfyNum = identfyNum == null ? null : identfyNum.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }
}