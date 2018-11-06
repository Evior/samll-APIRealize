package com.evio.samll2.Controller;


import com.evio.samll2.Service.GoodsdetailService;
import com.evio.samll2.VO.GoodsdetailVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class GoodsdetailController {


    @Autowired
    private GoodsdetailService goodsdetailService;

    @RequestMapping("/small/goodsdetail/list")
    public Object getGoodsdetailList(Integer goodsId,String cb){
        Map map=new HashMap();
        try {
            GoodsdetailVO goodsdetailList = goodsdetailService.getGoodsdetailList(goodsId);
            MappingJacksonValue mappingJacksonValue=new MappingJacksonValue(goodsdetailList);
            mappingJacksonValue.setJsonpFunction(cb);
            return mappingJacksonValue;
        }catch (Exception e){
            map.put("msg","成功");
            MappingJacksonValue mappingJacksonValue=new MappingJacksonValue(map);
            mappingJacksonValue.setJsonpFunction(cb);
            return mappingJacksonValue;
        }

    }

}
