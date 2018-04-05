package com.evio.samll2.VO;

import java.util.Date;

//{"id":1,"content":"1123455","icon":"","date":""}
public class GoodsCommentVO {

    private Integer id;
    private String content;
    private String icon;
    private Date date;

    public GoodsCommentVO() {
    }

    public GoodsCommentVO(Integer id, String content, String icon, Date date) {
        this.id = id;
        this.content = content;
        this.icon = icon;
        this.date = date;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "GoodsCommentVO{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", icon='" + icon + '\'' +
                ", date=" + date +
                '}';
    }
}
