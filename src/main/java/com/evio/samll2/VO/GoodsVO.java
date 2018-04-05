package com.evio.samll2.VO;

public class GoodsVO {
    private Integer id;

    private String name;

    private Double price;

    private Integer goodstype;

    private String img;

    private Integer discount;

    private Integer ishot;

    private Integer saled;

    private String goodsdesc;

    private Integer rate;

    private Boolean isnew;

    public GoodsVO() {
    }

    public GoodsVO(Integer id, String name, Double price, Integer goodstype, String img, Integer discount, Integer ishot, Integer saled, String goodsdesc, Integer rate, Boolean isnew) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.goodstype = goodstype;
        this.img = img;
        this.discount = discount;
        this.ishot = ishot;
        this.saled = saled;
        this.goodsdesc = goodsdesc;
        this.rate = rate;
        this.isnew = isnew;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getGoodstype() {
        return goodstype;
    }

    public void setGoodstype(Integer goodstype) {
        this.goodstype = goodstype;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Integer getIshot() {
        return ishot;
    }

    public void setIshot(Integer ishot) {
        this.ishot = ishot;
    }

    public Integer getSaled() {
        return saled;
    }

    public void setSaled(Integer saled) {
        this.saled = saled;
    }

    public String getGoodsdesc() {
        return goodsdesc;
    }

    public void setGoodsdesc(String goodsdesc) {
        this.goodsdesc = goodsdesc;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public Boolean getIsnew() {
        return isnew;
    }

    public void setIsnew(Boolean isnew) {
        this.isnew = isnew;
    }

    @Override
    public String toString() {
        return "GoodsVO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", goodstype=" + goodstype +
                ", img='" + img + '\'' +
                ", discount=" + discount +
                ", ishot=" + ishot +
                ", saled=" + saled +
                ", goodsdesc='" + goodsdesc + '\'' +
                ", rate=" + rate +
                ", isnew=" + isnew +
                '}';
    }
}
