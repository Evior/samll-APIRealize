package com.evio.samll2.Controller;

import com.evio.samll2.Service.UserService;
import com.evio.samll2.VO.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/small/userCenter")
    public Object getUser(String id,String cb){
        Map map=new HashMap();
        try {
            UserVO user=null;
            if (id!=null&&!id.equals("")){
                user= userService.getUserById(id);
            }
            MappingJacksonValue mappingJacksonValue=new MappingJacksonValue(user);
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
