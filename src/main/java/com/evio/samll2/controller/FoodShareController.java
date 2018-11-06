package com.evio.samll2.Controller;

import com.evio.samll2.Service.FoodShareService;
import com.evio.samll2.pojo.FoodSharing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class FoodShareController {
    @Autowired
    private FoodShareService foodShareService;

    @RequestMapping(value = "/small/foodShare/list")
    public Object getFoodShareList(String cb){
        Map map=new HashMap();
        try {
            List<FoodSharing> foodShareList = foodShareService.getFoodShareList();
            MappingJacksonValue mappingJacksonValue=new MappingJacksonValue(foodShareList);
            mappingJacksonValue.setJsonpFunction(cb);
            return mappingJacksonValue;
        }catch (Exception e){
            map.put("msg","成功");
            List<FoodSharing> foodShareList = foodShareService.getFoodShareList();
            MappingJacksonValue mappingJacksonValue=new MappingJacksonValue(map);
            mappingJacksonValue.setJsonpFunction(cb);
            return mappingJacksonValue;
        }

    }
}
