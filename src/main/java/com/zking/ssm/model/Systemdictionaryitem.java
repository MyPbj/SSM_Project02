package com.zking.ssm.model;

import java.io.Serializable;

public class Systemdictionaryitem implements Serializable{
    private Integer id;

    private Integer parentid;

    private String title;

    private String tvalue;

    private Byte sequence;

    private String intro;

    public Systemdictionaryitem(Integer id, Integer parentid, String title, String tvalue, Byte sequence, String intro) {
        this.id = id;
        this.parentid = parentid;
        this.title = title;
        this.tvalue = tvalue;
        this.sequence = sequence;
        this.intro = intro;
    }

    public Systemdictionaryitem() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTvalue() {
        return tvalue;
    }

    public void setTvalue(String tvalue) {
        this.tvalue = tvalue;
    }

    public Byte getSequence() {
        return sequence;
    }

    public void setSequence(Byte sequence) {
        this.sequence = sequence;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }
}