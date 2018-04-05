package com.evio.samll2.pojo;

import java.util.Date;

public class OrderComment {
    private Integer id;

    private String orderid;

    private Integer rate;

    private Date creaetdate;

    private Date updatedate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public Date getCreaetdate() {
        return creaetdate;
    }

    public void setCreaetdate(Date creaetdate) {
        this.creaetdate = creaetdate;
    }

    public Date getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }
}