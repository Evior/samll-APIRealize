package com.evio.samll2.Controller;

import com.evio.samll2.Service.GoodsTypeService;
import com.evio.samll2.VO.GoodstypeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/small/goodsType")
public class GoodTypeController {

    @Autowired
    private GoodsTypeService goodsTypeService;

    @RequestMapping(value = "/list")
    public Object list(String cb){
        Map map=new HashMap();
        try {
            List<GoodstypeVO> goodsTypeList = goodsTypeService.getGoodsTypeList();
            MappingJacksonValue mappingJacksonValue=new MappingJacksonValue(goodsTypeList);
            mappingJacksonValue.setJsonpFunction(cb);
            return mappingJacksonValue;
        }catch (Exception e){
            map.put("msg","失败");
            MappingJacksonValue mappingJacksonValue=new MappingJacksonValue(map);
            mappingJacksonValue.setJsonpFunction(cb);
            return mappingJacksonValue;
        }

    }

}
