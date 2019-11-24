package com.zking.ssm.model;

import java.io.Serializable;

public class Account implements Serializable{
    private Integer id;

    private String logininfoid;

    private String tradepassword;

    private Float usableamount;

    private Float freezedamount;

    private Integer version;

    private Float unreceiveinterest;

    private Float unreceiveprincipal;

    private Float unreturnamount;

    private Float remainborrowlimit;

    private Float borrowlimit;

    public Account(Integer id, String logininfoid, String tradepassword, Float usableamount, Float freezedamount, Integer version, Float unreceiveinterest, Float unreceiveprincipal, Float unreturnamount, Float remainborrowlimit, Float borrowlimit) {
        this.id = id;
        this.logininfoid = logininfoid;
        this.tradepassword = tradepassword;
        this.usableamount = usableamount;
        this.freezedamount = freezedamount;
        this.version = version;
        this.unreceiveinterest = unreceiveinterest;
        this.unreceiveprincipal = unreceiveprincipal;
        this.unreturnamount = unreturnamount;
        this.remainborrowlimit = remainborrowlimit;
        this.borrowlimit = borrowlimit;
    }

    public Account() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogininfoid() {
        return logininfoid;
    }

    public void setLogininfoid(String logininfoid) {
        this.logininfoid = logininfoid;
    }

    public String getTradepassword() {
        return tradepassword;
    }

    public void setTradepassword(String tradepassword) {
        this.tradepassword = tradepassword;
    }

    public Float getUsableamount() {
        return usableamount;
    }

    public void setUsableamount(Float usableamount) {
        this.usableamount = usableamount;
    }

    public Float getFreezedamount() {
        return freezedamount;
    }

    public void setFreezedamount(Float freezedamount) {
        this.freezedamount = freezedamount;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Float getUnreceiveinterest() {
        return unreceiveinterest;
    }

    public void setUnreceiveinterest(Float unreceiveinterest) {
        this.unreceiveinterest = unreceiveinterest;
    }

    public Float getUnreceiveprincipal() {
        return unreceiveprincipal;
    }

    public void setUnreceiveprincipal(Float unreceiveprincipal) {
        this.unreceiveprincipal = unreceiveprincipal;
    }

    public Float getUnreturnamount() {
        return unreturnamount;
    }

    public void setUnreturnamount(Float unreturnamount) {
        this.unreturnamount = unreturnamount;
    }

    public Float getRemainborrowlimit() {
        return remainborrowlimit;
    }

    public void setRemainborrowlimit(Float remainborrowlimit) {
        this.remainborrowlimit = remainborrowlimit;
    }

    public Float getBorrowlimit() {
        return borrowlimit;
    }

    public void setBorrowlimit(Float borrowlimit) {
        this.borrowlimit = borrowlimit;
    }
}