package com.zking.ssm.model;

import java.io.Serializable;

public class Userinfo implements Serializable{
    private String id;

    private String username;

    private String password;

    private Integer version;

    private Integer bitstate;

    private String realname;

    private Integer score;

    private Integer realauthid;

    private String idnumber;

    private String phonenumber;

    private Float incomegradeid;

    private Integer marriageid;

    private Integer kidcountid;

    private Integer educationbackgroundid;

    private Integer houseconditionid;

    private String email;

    private String salt;

    public Userinfo(String id, String username, String password, Integer version, Integer bitstate, String realname, Integer score, Integer realauthid, String idnumber, String phonenumber, Float incomegradeid, Integer marriageid, Integer kidcountid, Integer educationbackgroundid, Integer houseconditionid, String email, String salt) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.version = version;
        this.bitstate = bitstate;
        this.realname = realname;
        this.score = score;
        this.realauthid = realauthid;
        this.idnumber = idnumber;
        this.phonenumber = phonenumber;
        this.incomegradeid = incomegradeid;
        this.marriageid = marriageid;
        this.kidcountid = kidcountid;
        this.educationbackgroundid = educationbackgroundid;
        this.houseconditionid = houseconditionid;
        this.email = email;
        this.salt = salt;
    }

    public Userinfo() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getBitstate() {
        return bitstate;
    }

    public void setBitstate(Integer bitstate) {
        this.bitstate = bitstate;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getRealauthid() {
        return realauthid;
    }

    public void setRealauthid(Integer realauthid) {
        this.realauthid = realauthid;
    }

    public String getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public Float getIncomegradeid() {
        return incomegradeid;
    }

    public void setIncomegradeid(Float incomegradeid) {
        this.incomegradeid = incomegradeid;
    }

    public Integer getMarriageid() {
        return marriageid;
    }

    public void setMarriageid(Integer marriageid) {
        this.marriageid = marriageid;
    }

    public Integer getKidcountid() {
        return kidcountid;
    }

    public void setKidcountid(Integer kidcountid) {
        this.kidcountid = kidcountid;
    }

    public Integer getEducationbackgroundid() {
        return educationbackgroundid;
    }

    public void setEducationbackgroundid(Integer educationbackgroundid) {
        this.educationbackgroundid = educationbackgroundid;
    }

    public Integer getHouseconditionid() {
        return houseconditionid;
    }

    public void setHouseconditionid(Integer houseconditionid) {
        this.houseconditionid = houseconditionid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }
}