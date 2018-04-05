package com.evio.samll2.Controller;

import com.evio.samll2.Service.CartService;
import com.evio.samll2.pojo.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class CartController {

    @Autowired
    private CartService cartService;

    @RequestMapping(value = "/small/cart/add")
    public Object add(Integer id,Integer count,String cb){
        Map map=new HashMap();
        try {
            if (id!=null&&count!=null)
                cartService.addGoodsToCart( id, count);
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

    @RequestMapping(value = "/small/cart/delete")
    public Object delete(Integer id,String cb){
        Map map=new HashMap();
        try {
            cartService.deleteItemById(id);
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

    @RequestMapping(value = "/small/cart/deleteAll")
    public Object deleteAll(String cb){

        Map map=new HashMap();

        try {
            map.put("msg","成功");
            cartService.deleteAll();
            MappingJacksonValue mappingJacksonValue=new MappingJacksonValue(map);
            mappingJacksonValue.setJsonpFunction(cb);
            return mappingJacksonValue;
        }catch (Exception e){
            map.put("msg","失败");
            cartService.deleteAll();
            MappingJacksonValue mappingJacksonValue=new MappingJacksonValue(map);
            mappingJacksonValue.setJsonpFunction(cb);
            return mappingJacksonValue;
        }



    }

    @RequestMapping(value = "/small/cart/list")
    public Object getCartList(String cb){
        Map map=new HashMap();
        try {
            List<Cart> cartList = cartService.getCartList();
            MappingJacksonValue mappingJacksonValue=new MappingJacksonValue(cartList);
            mappingJacksonValue.setJsonpFunction(cb);
            return mappingJacksonValue;
        }catch (Exception e){
            map.put("msg","成功");
            MappingJacksonValue mappingJacksonValue=new MappingJacksonValue(map);
            mappingJacksonValue.setJsonpFunction(cb);
            return mappingJacksonValue;
        }

    }


    @RequestMapping(value = "/small/cart/count")
    public Object getCartCount(String cb){
        Map map=new HashMap();
        try {
            Integer cartCount = cartService.getCartCount();
            MappingJacksonValue mappingJacksonValue=new MappingJacksonValue(cartCount);
            mappingJacksonValue.setJsonpFunction(cb);
            return mappingJacksonValue;
        }catch (Exception e){
            map.put("msg","成功");
            MappingJacksonValue mappingJacksonValue=new MappingJacksonValue(map);
            mappingJacksonValue.setJsonpFunction(cb);
            return mappingJacksonValue;
        }

    }

    @RequestMapping(value = "/small/cart/updateStatus")
    public Object updateCartStatus(Integer statusId,String cb){
        Map map=new HashMap();
        try {
            cartService.updateCartStatus(statusId);
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
