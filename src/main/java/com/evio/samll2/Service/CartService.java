package com.evio.samll2.Service;


import com.evio.samll2.pojo.Cart;

import java.util.List;

public interface CartService {
     void addGoodsToCart(Integer id,Integer count);
     List<Cart> getCartList();

     void deleteItemById(Integer id);

     void deleteAll();

     Integer getCartCount();

    void updateCartStatus(Integer statusId);
}
