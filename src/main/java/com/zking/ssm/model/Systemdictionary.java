package com.zking.ssm.model;

import java.io.Serializable;

public class Systemdictionary implements Serializable{
    private Integer id;

    private String sn;

    private String title;

    private String intro;

    public Systemdictionary(Integer id, String sn, String title, String intro) {
        this.id = id;
        this.sn = sn;
        this.title = title;
        this.intro = intro;
    }

    public Systemdictionary() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }
}