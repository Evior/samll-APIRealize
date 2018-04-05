package com.evio.samll2.Service.impl;

import com.evio.samll2.Service.OrderService;
import com.evio.samll2.VO.OrderVO;
import com.evio.samll2.mapper.CartMapper;
import com.evio.samll2.mapper.OrderCommentMapper;
import com.evio.samll2.mapper.OrderGoodsMapper;
import com.evio.samll2.mapper.OrderMapper;
import com.evio.samll2.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private CartMapper cartMapper;

    @Autowired
    private OrderGoodsMapper orderGoodsMapper;

    @Autowired
    private OrderCommentMapper orderCommentMapper;

    @Override
    @Transactional
    public List<OrderVO> getOrderList() {

        OrderExample orderExample=new OrderExample();
        OrderExample.Criteria criteria = orderExample.createCriteria();
        criteria.andIdIsNotNull();
        List<Order> orders = orderMapper.selectByExample(orderExample);
        List<OrderVO> orderVOS=new ArrayList<>();
        for (Order order:orders){
            OrderVO orderVO=new OrderVO();
            //通过订单号查询 对应的商品
            OrderGoodsExample orderGoodsExample=new OrderGoodsExample();
            OrderGoodsExample.Criteria criteria1 = orderGoodsExample.createCriteria();
            criteria1.andOrderidEqualTo(order.getId());
            List<OrderGoods> orderGoodsList = orderGoodsMapper.selectByExample(orderGoodsExample);

            //封装orderVO
            orderVO.setId(order.getId().toString());
            orderVO.setOrderStatus(order.getOrderstatus());
            orderVO.setSellerName(order.getSellername());
            orderVO.setGoodsList(orderGoodsList);
            //加入list
            orderVOS.add(orderVO);
        }

        return orderVOS;
    }

    @Override
    @Transactional
    public void deleteByOrderId(Integer orderId) {
        //先删除订单对象的物品
        OrderGoodsExample example=new OrderGoodsExample();
        OrderGoodsExample.Criteria criteria = example.createCriteria();
        criteria.andOrderidEqualTo(orderId.toString());
        orderGoodsMapper.deleteByExample(example);
        //删除订单
        orderMapper.deleteByPrimaryKey(orderId.toString());
    }


    @Transactional
    public void createOrder(Integer rate){
        CartExample example=new CartExample();
        CartExample.Criteria criteria = example.createCriteria();
        criteria.andIdIsNotNull();
        List<Cart> cartList = cartMapper.selectByExample(example);
        if (cartList!=null&&cartList.size()>0){
            /*生成订单*/
            Order order=new Order();
            long l = System.currentTimeMillis();
            String mills=l+"";
            Random random=new Random();
            String i = random.nextInt(1000)+"";
            String id=mills+i;
            order.setId(id);
            order.setSellername("小碗菜");
            order.setCreaetdate(new Date());
            order.setUpdatedate(new Date());
            order.setOrderstatus(3);//0 未付款  1 已付款  2 收到货物 3 已评价
            orderMapper.insert(order);
            /*生成订单评论*/
            OrderComment comment=new OrderComment();
            comment.setRate(rate);
            comment.setOrderid(id);
            comment.setUpdatedate(new Date());
            comment.setCreaetdate(new Date());
            orderCommentMapper.insert(comment);
            /*生成订单商品列表*/
            for (Cart cart:cartList){
                OrderGoods orderGoods=new OrderGoods();
                orderGoods.setOrderid(id);
                orderGoods.setCreaetdate(new Date());
                orderGoods.setUpdatedate(new Date());
                orderGoods.setGoodid(cart.getGoodsid());
                orderGoods.setGoodimg(cart.getGoodsimg());
                orderGoods.setGoodname(cart.getGoodsname());
                orderGoods.setGoodnum(cart.getGoodscount());
                orderGoods.setGoodprice(cart.getGoodsprice());
                orderGoodsMapper.insert(orderGoods);
            }
        }

    }
}
