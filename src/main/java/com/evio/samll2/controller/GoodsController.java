package com.evio.samll2.Controller;

import com.evio.samll2.Service.GoodsService;
import com.evio.samll2.VO.GoodsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @RequestMapping(value = "/small/goods/list")
    public Object getGoodsList(String cb) {
        Map map=new HashMap();
        try {
            List<GoodsVO> goodsList = goodsService.getGoodsList();
            MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(goodsList);
            mappingJacksonValue.setJsonpFunction(cb);
            return mappingJacksonValue;
        } catch (Exception e) {
            map.put("msg","成功");
            MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(map);
            mappingJacksonValue.setJsonpFunction(cb);
            return mappingJacksonValue;
        }
    }
}
