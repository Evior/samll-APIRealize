package com.evio.samll2.Controller;

import com.evio.samll2.Service.OrderCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class OrderCommentController {

    @Autowired
    private OrderCommentService orderCommentService;
    @RequestMapping(value = "/small/orderComment/add")
    private Object addOrderComment(Integer orderId,Integer rate,String cb){
        Map map=new HashMap();
        try {
            orderCommentService.addComment(orderId,rate);
            map.put("msg","成功");
            MappingJacksonValue mappingJacksonValue=new MappingJacksonValue(map);
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
