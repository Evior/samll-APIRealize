package com.evio.samll2.Service.impl;

import com.evio.samll2.Service.GoodsService;
import com.evio.samll2.Service.GoodsdetailService;
import com.evio.samll2.VO.GoodsCommentVO;
import com.evio.samll2.VO.GoodsVO;
import com.evio.samll2.VO.GoodsdetailVO;
import com.evio.samll2.mapper.GoodsCommentMapper;
import com.evio.samll2.mapper.GoodsMapper;
import com.evio.samll2.mapper.UserMapper;
import com.evio.samll2.pojo.Goods;
import com.evio.samll2.pojo.GoodsComment;
import com.evio.samll2.pojo.GoodsCommentExample;
import com.evio.samll2.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


@Service
public class GoodsdetailServiceImpl  implements GoodsdetailService{

    @Autowired
    private GoodsMapper goodsMapper;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private GoodsCommentMapper goodsCommentMapper;
    @Override
    @Transactional
    public GoodsdetailVO getGoodsdetailList(Integer goodsId) {
        //根据商品id查询商品信息
        Goods goods = goodsMapper.selectByPrimaryKey(goodsId);
        //根据商品id查询评论列表信息
        GoodsCommentExample example=new GoodsCommentExample();
        GoodsCommentExample.Criteria criteria = example.createCriteria();
        criteria.andGoodsidEqualTo(goodsId);
        List<GoodsComment> goodsComments = goodsCommentMapper.selectByExample(example);
        List<GoodsCommentVO> goodsCommentVOS=new ArrayList<>();
        for (GoodsComment goodsComment:goodsComments){
            GoodsCommentVO goodsCommentVO=new GoodsCommentVO();
            goodsCommentVO.setId(goodsComment.getId());
            goodsCommentVO.setContent(goodsComment.getContent());
            User user = userMapper.selectByPrimaryKey(goodsComment.getUserid() + "");
            goodsCommentVO.setIcon(user.getIcon());
            goodsCommentVOS.add(goodsCommentVO);
        }
        //封装GooddetailVO对象
        GoodsdetailVO goodsdetailVO=new GoodsdetailVO();
        goodsdetailVO.setDiscount(goods.getDiscount());
        goodsdetailVO.setId(goods.getId());
        goodsdetailVO.setPrice(goods.getPrice());
        goodsdetailVO.setTilte(goods.getName());
        goodsdetailVO.setSaled(goods.getSaled());
        goodsdetailVO.setUrl(goods.getImg());
        goodsdetailVO.setGoodsCommentList(goodsCommentVOS);
        return goodsdetailVO;
    }
}
