package com.evio.samll2.Service.impl;

import com.evio.samll2.Service.SwipeService;
import com.evio.samll2.VO.SwipeVO;
import com.evio.samll2.mapper.SwipeMapper;
import com.evio.samll2.pojo.Swipe;
import com.evio.samll2.pojo.SwipeExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class SwipeServiceImpl implements SwipeService {
    @Autowired
    private SwipeMapper swipeMapper;
    @Override
    @Transactional
    public List<SwipeVO> getSwipeList() {

        SwipeExample example = new SwipeExample();
        SwipeExample.Criteria criteria = example.createCriteria();
        criteria.andIdIsNotNull();
        List<Swipe> swipes = swipeMapper.selectByExample(example);
        ArrayList<SwipeVO> swipeVOS = new ArrayList<>();
        for (Swipe swipe:swipes){
            SwipeVO swipeVO=new SwipeVO();
            swipeVO.setId(swipe.getId());
            swipeVO.setUrl(swipe.getUrl());
            swipeVOS.add(swipeVO);
        }
        return swipeVOS;
    }
}
