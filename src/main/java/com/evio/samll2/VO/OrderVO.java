package com.evio.samll2.VO;

import com.evio.samll2.pojo.Goods;
import com.evio.samll2.pojo.OrderGoods;

import java.util.List;

/*
 {"id":1,"sellerName":"小碗菜","orderStatus":0,"goodsList":[
              {"goodId":1,"goodName":"泡蒸鳝鱼","goodPrice":50,"goodNum":5,"goodImg":""},
              {"goodId":1,"goodName":"泡蒸鳝鱼","goodPrice":50,"goodNum":5,"goodImg":""}
              ]
          }
 */
public class OrderVO {

    private String id;
    private String sellerName;
    private Integer orderStatus;
    private List<OrderGoods> goodsList;

    public OrderVO() {
    }

    public OrderVO(String id, String sellerName, Integer orderStatus, List<OrderGoods> goodsList) {
        this.id = id;
        this.sellerName = sellerName;
        this.orderStatus = orderStatus;
        this.goodsList = goodsList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public List<OrderGoods> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<OrderGoods> goodsList) {
        this.goodsList = goodsList;
    }

    @Override
    public String toString() {
        return "OrderVO{" +
                "id=" + id +
                ", sellerName='" + sellerName + '\'' +
                ", orderStatus=" + orderStatus +
                ", goodsList=" + goodsList +
                '}';
    }
}
