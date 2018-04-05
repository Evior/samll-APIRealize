package com.evio.samll2.Controller;

import com.evio.samll2.Service.OrderService;
import com.evio.samll2.VO.OrderVO;
import com.evio.samll2.VO.SmallResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/small/order/list")
    public Object getOrderList(String cb){
        Map map=new HashMap();
        try {
            List<OrderVO> orderList = orderService.getOrderList();
            MappingJacksonValue mappingJacksonValue=new MappingJacksonValue(orderList);
            mappingJacksonValue.setJsonpFunction(cb);
            return mappingJacksonValue;
        }catch (Exception e){
            map.put("msg","失败");
            MappingJacksonValue mappingJacksonValue=new MappingJacksonValue(map);
            mappingJacksonValue.setJsonpFunction(cb);
            return mappingJacksonValue;
        }

    }

    @RequestMapping(value = "/small/order/delete")
    public Object getOrderList(Integer orderId,String cb){
        Map map=new HashMap();
        try {
            orderService.deleteByOrderId(orderId);
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


    @RequestMapping(value = "/small/order/create")
    public Object createOrder(Integer rate,String cb){
        HashMap<String, String> map = new HashMap<>();
        try {
            orderService.createOrder(rate);
            map.put("msg","成功");
            //SmallResult result=SmallResult.ok();
            MappingJacksonValue mappingJacksonValue=new MappingJacksonValue(map);
            mappingJacksonValue.setJsonpFunction(cb);
            return mappingJacksonValue;
        }catch ( Exception e){
            map.put("msg","失败");
            //SmallResult result=SmallResult.ok();
            MappingJacksonValue mappingJacksonValue=new MappingJacksonValue(map);
            mappingJacksonValue.setJsonpFunction(cb);
            return mappingJacksonValue;
        }

    }
}
