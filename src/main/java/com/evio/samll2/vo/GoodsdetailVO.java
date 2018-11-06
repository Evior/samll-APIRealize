package com.evio.samll2.VO;

import com.evio.samll2.pojo.GoodsComment;
import com.evio.samll2.pojo.OrderComment;

import java.util.List;

/**
 * {"id":1,"title":"泡蒸鳝鱼","url":"","price":50,"discount":8,"saled":1000,"comments":[
 {"id":1,"content":"1123455","icon":"","date":""}
 ]}
 */
public class GoodsdetailVO {
    private Integer id;
    private String tilte;
    private String url;
    private Double price;
    private Integer discount;
    private Integer saled;
    private List<GoodsCommentVO> goodsCommentList;

    public GoodsdetailVO() {
    }

    public GoodsdetailVO(Integer id, String tilte, String url, Double price, Integer discount, Integer saled, List<GoodsCommentVO> goodsCommentList) {
        this.id = id;
        this.tilte = tilte;
        this.url = url;
        this.price = price;
        this.discount = discount;
        this.saled = saled;
        this.goodsCommentList = goodsCommentList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTilte() {
        return tilte;
    }

    public void setTilte(String tilte) {
        this.tilte = tilte;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Integer getSaled() {
        return saled;
    }

    public void setSaled(Integer saled) {
        this.saled = saled;
    }

    public List<GoodsCommentVO> getGoodsCommentList() {
        return goodsCommentList;
    }

    public void setGoodsCommentList(List<GoodsCommentVO> goodsCommentList) {
        this.goodsCommentList = goodsCommentList;
    }

    @Override
    public String toString() {
        return "GoodsdetailVO{" +
                "id=" + id +
                ", tilte='" + tilte + '\'' +
                ", url='" + url + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", saled=" + saled +
                ", goodsCommentList=" + goodsCommentList +
                '}';
    }
}
