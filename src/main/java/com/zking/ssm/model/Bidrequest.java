package com.zking.ssm.model;

import java.util.Date;

public class Bidrequest {
    private Integer id;

    private Integer version;

    private Integer returntype;

    private Integer bidrequesttype;

    private Integer bidrequeststate;

    private Double bidrequestamount;

    private Double currentrate;

    private Integer monthes2return;

    private Integer bidcount;

    private Double totalrewardamount;

    private Double currentsum;

    private String title;

    private String description;

    private String note;

    private Date disabledate;

    private Integer createuserId;

    private Integer disabledays;

    private Double minbidamount;

    private Date applytime;

    private Date publishtime;

    public Bidrequest(Integer id, Integer version, Integer returntype, Integer bidrequesttype, Integer bidrequeststate, Double bidrequestamount, Double currentrate, Integer monthes2return, Integer bidcount, Double totalrewardamount, Double currentsum, String title, String description, String note, Date disabledate, Integer createuserId, Integer disabledays, Double minbidamount, Date applytime, Date publishtime) {
        this.id = id;
        this.version = version;
        this.returntype = returntype;
        this.bidrequesttype = bidrequesttype;
        this.bidrequeststate = bidrequeststate;
        this.bidrequestamount = bidrequestamount;
        this.currentrate = currentrate;
        this.monthes2return = monthes2return;
        this.bidcount = bidcount;
        this.totalrewardamount = totalrewardamount;
        this.currentsum = currentsum;
        this.title = title;
        this.description = description;
        this.note = note;
        this.disabledate = disabledate;
        this.createuserId = createuserId;
        this.disabledays = disabledays;
        this.minbidamount = minbidamount;
        this.applytime = applytime;
        this.publishtime = publishtime;
    }

    public Bidrequest() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getReturntype() {
        return returntype;
    }

    public void setReturntype(Integer returntype) {
        this.returntype = returntype;
    }

    public Integer getBidrequesttype() {
        return bidrequesttype;
    }

    public void setBidrequesttype(Integer bidrequesttype) {
        this.bidrequesttype = bidrequesttype;
    }

    public Integer getBidrequeststate() {
        return bidrequeststate;
    }

    public void setBidrequeststate(Integer bidrequeststate) {
        this.bidrequeststate = bidrequeststate;
    }

    public Double getBidrequestamount() {
        return bidrequestamount;
    }

    public void setBidrequestamount(Double bidrequestamount) {
        this.bidrequestamount = bidrequestamount;
    }

    public Double getCurrentrate() {
        return currentrate;
    }

    public void setCurrentrate(Double currentrate) {
        this.currentrate = currentrate;
    }

    public Integer getMonthes2return() {
        return monthes2return;
    }

    public void setMonthes2return(Integer monthes2return) {
        this.monthes2return = monthes2return;
    }

    public Integer getBidcount() {
        return bidcount;
    }

    public void setBidcount(Integer bidcount) {
        this.bidcount = bidcount;
    }

    public Double getTotalrewardamount() {
        return totalrewardamount;
    }

    public void setTotalrewardamount(Double totalrewardamount) {
        this.totalrewardamount = totalrewardamount;
    }

    public Double getCurrentsum() {
        return currentsum;
    }

    public void setCurrentsum(Double currentsum) {
        this.currentsum = currentsum;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getDisabledate() {
        return disabledate;
    }

    public void setDisabledate(Date disabledate) {
        this.disabledate = disabledate;
    }

    public Integer getCreateuserId() {
        return createuserId;
    }

    public void setCreateuserId(Integer createuserId) {
        this.createuserId = createuserId;
    }

    public Integer getDisabledays() {
        return disabledays;
    }

    public void setDisabledays(Integer disabledays) {
        this.disabledays = disabledays;
    }

    public Double getMinbidamount() {
        return minbidamount;
    }

    public void setMinbidamount(Double minbidamount) {
        this.minbidamount = minbidamount;
    }

    public Date getApplytime() {
        return applytime;
    }

    public void setApplytime(Date applytime) {
        this.applytime = applytime;
    }

    public Date getPublishtime() {
        return publishtime;
    }

    public void setPublishtime(Date publishtime) {
        this.publishtime = publishtime;
    }
}