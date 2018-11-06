package com.evio.samll2.Service.impl;

import com.evio.samll2.Service.GoodsService;
import com.evio.samll2.VO.GoodsVO;
import com.evio.samll2.mapper.GoodsMapper;
import com.evio.samll2.pojo.Goods;
import com.evio.samll2.pojo.GoodsExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService{

    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    @Transactional
    public List<GoodsVO> getGoodsList() {
        GoodsExample goodsExample=new GoodsExample();
        GoodsExample.Criteria criteria = goodsExample.createCriteria();
        criteria.andIdIsNotNull();
        List<Goods> goodsList = goodsMapper.selectByExample(goodsExample);
        List<GoodsVO> goodsVOList=new ArrayList<>();
        for (Goods good:goodsList){
            GoodsVO goodsVO=new GoodsVO();
            goodsVO.setId(good.getId());
            goodsVO.setDiscount(good.getDiscount());
            goodsVO.setGoodsdesc(good.getGoodsdesc());
            goodsVO.setDiscount(good.getDiscount());
            goodsVO.setGoodstype(good.getGoodstype());
            goodsVO.setImg(good.getImg());
            goodsVO.setIshot(good.getIshot());
            goodsVO.setIsnew(good.getIsnew());
            goodsVO.setName(good.getName());
            goodsVO.setPrice(good.getPrice());
            goodsVO.setRate(good.getRate());
            goodsVO.setSaled(good.getSaled());
            goodsVOList.add(goodsVO);
        }
        return goodsVOList;
    }
}
