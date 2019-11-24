package com.zking.ssm.model;

import java.io.Serializable;

public class ModuleInfo implements Serializable{
    private String id;

    private String pid;

    private String text;

    private String icon;

    private String url;

    private Integer sort;

    public ModuleInfo(String id, String pid, String text, String icon, String url, Integer sort) {
        this.id = id;
        this.pid = pid;
        this.text = text;
        this.icon = icon;
        this.url = url;
        this.sort = sort;
    }

    public ModuleInfo() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}