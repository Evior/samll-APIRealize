package com.evio.samll2.Service;

import com.evio.samll2.VO.OrderVO;

import java.util.List;

public interface OrderService {

     List<OrderVO> getOrderList();
     void deleteByOrderId(Integer orderId);
     void createOrder(Integer rate);
}
