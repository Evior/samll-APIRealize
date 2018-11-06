package com.evio.samll2.Service.impl;

import com.evio.samll2.Service.FoodShareService;
import com.evio.samll2.mapper.FoodSharingMapper;
import com.evio.samll2.pojo.FoodSharing;
import com.evio.samll2.pojo.FoodSharingExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class FoodShareServiceImpl implements FoodShareService {
    @Autowired
    private FoodSharingMapper foodSharingMapper;
    @Override
    @Transactional
    public List<FoodSharing> getFoodShareList() {
        FoodSharingExample example=new FoodSharingExample();
        FoodSharingExample.Criteria criteria = example.createCriteria();
        criteria.andIdIsNotNull();
        List<FoodSharing> foodSharings = foodSharingMapper.selectByExample(example);
        return foodSharings;
    }
}
