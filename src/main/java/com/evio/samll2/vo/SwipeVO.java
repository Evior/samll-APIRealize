package com.evio.samll2.VO;

public class SwipeVO {
    private Integer id;

    private String url;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public SwipeVO() {
    }

    public SwipeVO(Integer id, String url) {
        this.id = id;
        this.url = url;
    }

    @Override
    public String toString() {
        return "SwipeVO{" +
                "id=" + id +
                ", url='" + url + '\'' +
                '}';
    }
}
