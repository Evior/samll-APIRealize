package com.evio.samll2.Service.impl;

import com.evio.samll2.Service.CartService;
import com.evio.samll2.mapper.CartMapper;
import com.evio.samll2.mapper.GoodsMapper;
import com.evio.samll2.pojo.Cart;
import com.evio.samll2.pojo.CartExample;
import com.evio.samll2.pojo.Goods;
import com.evio.samll2.pojo.GoodsExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class CartServiceImpl implements CartService {
    @Autowired
    private CartMapper cartMapper;

    @Autowired
    private GoodsMapper goodsMapper;
    @Override
    @Transactional
    public void addGoodsToCart(Integer id,Integer count) {
        Cart cart=new Cart();
        //封装cart对象
        cart.setGoodsid(id);
        cart.setGoodscount(count);
        cart.setGoodsstatus(0);
        //通过goodid获取商品信息
        Goods good = goodsMapper.selectByPrimaryKey(id);
        cart.setGoodsimg(good.getImg());
        cart.setCreaetdate(new Date());
        cart.setUpdatedate(new Date());
        cart.setGoodsprice(good.getPrice());
        cart.setGoodsname(good.getName());
        if (cart!=null){
            cartMapper.insert(cart);
        }
    }

    @Override
    @Transactional
    public List<Cart> getCartList() {
        CartExample cartExample=new CartExample();
        CartExample.Criteria criteria = cartExample.createCriteria();
        criteria.andIdIsNotNull();
        List<Cart> carts = cartMapper.selectByExample(cartExample);
        return carts;
    }

    @Override
    @Transactional
    public void deleteItemById(Integer id) {
        if (id!=null)
       cartMapper.deleteByPrimaryKey(id);
    }

    @Override
    @Transactional
    public void deleteAll() {
        CartExample cartExample=new CartExample();
        CartExample.Criteria criteria = cartExample.createCriteria();
        criteria.andIdIsNotNull();
        cartMapper.deleteByExample(cartExample);
    }

    @Override
    @Transactional
    public Integer getCartCount() {
        CartExample example=new CartExample();
        CartExample.Criteria criteria = example.createCriteria();
        criteria.andIdIsNotNull();
        int i = cartMapper.countByExample(example);
        return i;
    }

    @Override
    @Transactional
    public void updateCartStatus(Integer statusId) {
        //获取所有的购物车商品
        CartExample cartExample=new CartExample();
        CartExample.Criteria criteria = cartExample.createCriteria();
        criteria.andIdIsNotNull();
        List<Cart> carts = cartMapper.selectByExample(cartExample);
        //遍历 更新商品状态
        for (Cart cart:carts)
        {
            cart.setGoodsstatus(statusId);
        }
    }


}
