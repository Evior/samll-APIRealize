package com.evio.samll2.Controller;

import com.evio.samll2.Service.SwipeService;
import com.evio.samll2.VO.SwipeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class SwipeServiceController {

    @Autowired
    private SwipeService swipeService;
    @RequestMapping(value = "/samll/swipe")
    public Object getSwipeList(String cb){
        Map map=new HashMap();
        try {
            List<SwipeVO> swipeList = swipeService.getSwipeList();
            MappingJacksonValue mappingJacksonValue=new MappingJacksonValue(swipeList);
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
