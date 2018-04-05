package com.evio.samll2.Service.impl;

import com.evio.samll2.Service.GoodsTypeService;
import com.evio.samll2.VO.GoodstypeVO;
import com.evio.samll2.mapper.GoodstypeMapper;
import com.evio.samll2.pojo.Goodstype;
import com.evio.samll2.pojo.GoodstypeExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class GoodsTypeServiceImpl implements GoodsTypeService {
    @Autowired
    private GoodstypeMapper mapper;
    @Override
    @Transactional
    public List<GoodstypeVO> getGoodsTypeList() {
        GoodstypeExample example = new GoodstypeExample();
        List<Goodstype> list = mapper.selectByExample(example);
        GoodstypeExample.Criteria criteria = example.createCriteria();
        criteria.andIdIsNotNull();
        List<GoodstypeVO> listVO=new ArrayList<>();
        for (Goodstype goodstype :list)
        {
            GoodstypeVO goodstypeVO=new GoodstypeVO();
            goodstypeVO.setId(goodstype.getId());
            goodstypeVO.setGoodsname(goodstype.getGoodsname());
            goodstypeVO.setGoodstype(goodstype.getGoodstype());
            goodstypeVO.setUrl(goodstype.getUrl());
            listVO.add(goodstypeVO);
        }
        return listVO;
    }
}
