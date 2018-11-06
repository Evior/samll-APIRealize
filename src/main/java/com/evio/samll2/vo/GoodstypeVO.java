package com.evio.samll2.VO;

public class GoodstypeVO {

    private Integer id;

    private Integer goodstype;

    private String url;

    private String goodsname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGoodstype() {
        return goodstype;
    }

    public void setGoodstype(Integer goodstype) {
        this.goodstype = goodstype;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public GoodstypeVO() {
    }

    public GoodstypeVO(Integer id, Integer goodstype, String url, String goodsname) {
        this.id = id;
        this.goodstype = goodstype;
        this.url = url;
        this.goodsname = goodsname;
    }

    @Override
    public String toString() {
        return "GoodstypeVO{" +
                "id=" + id +
                ", goodstype=" + goodstype +
                ", url='" + url + '\'' +
                ", goodsname='" + goodsname + '\'' +
                '}';
    }
}
