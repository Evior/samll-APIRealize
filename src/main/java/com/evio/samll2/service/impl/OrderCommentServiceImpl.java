package com.evio.samll2.Service.impl;


import com.evio.samll2.Service.OrderCommentService;
import com.evio.samll2.mapper.OrderCommentMapper;
import com.evio.samll2.pojo.OrderComment;
import com.evio.samll2.pojo.OrderCommentExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
public class OrderCommentServiceImpl implements OrderCommentService{

    @Autowired
    private OrderCommentMapper orderCommentMapper;
    @Override
    @Transactional
    public void addComment(Integer orderId,Integer rate ) {
        OrderComment orderComment=new OrderComment();
        orderComment.setRate(rate);
        orderComment.setOrderid(orderId.toString());
        orderComment.setCreaetdate(new Date());
        orderComment.setUpdatedate(new Date());
        orderCommentMapper.insert(orderComment);
    }
}
