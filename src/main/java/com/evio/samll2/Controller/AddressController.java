package com.evio.samll2.Controller;

import com.evio.samll2.Service.AddresssService;
import com.evio.samll2.pojo.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class AddressController {
    @Autowired
    private AddresssService addresssService;

    @RequestMapping(value = "/small/addresss/list")
    public Object getAddressList(String id,String cb){
        try {
            List<Address> addressList = addresssService.getAddressList(id);
            MappingJacksonValue mappingJacksonValue=new MappingJacksonValue(addressList);
            mappingJacksonValue.setJsonpFunction(cb);
            return mappingJacksonValue;
        }catch (Exception e){
            Map map=new HashMap();
            map.put("msg","失败");
            MappingJacksonValue mappingJacksonValue=new MappingJacksonValue(map);
            mappingJacksonValue.setJsonpFunction(cb);
            return mappingJacksonValue;
        }


    }

    @RequestMapping(value = "/small/addresss/add")
    public Object addAddress(String address,Integer userid,String phone,String username,String cb){
        Map map=new HashMap();
        try {
            Address addressObj=new Address();
            addressObj.setAddressname(username);
            addressObj.setAddress(address);
            addressObj.setUserid(userid+"");
            addressObj.setPhone(phone);
            addressObj.setCreaetdate(new Date());
            addressObj.setUpdatedate(new Date());
            addresssService.addAddress(addressObj);

            map.put("msg","成功!");
            MappingJacksonValue mappingJacksonValue=new MappingJacksonValue(map);
            mappingJacksonValue.setJsonpFunction(cb);
            return mappingJacksonValue;
        }catch (Exception e){
            map.put("msg","失败");
            return new MappingJacksonValue(map);
        }

    }

    @RequestMapping(value = "/small/address/delete")
    public Object deleteAddressById(Integer id,String cb){
        Map map=new HashMap();
        try {
            addresssService.deleteAddressById(id);
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

    @RequestMapping(value = "/small/address/update")
    public Object updateAddress(Integer id,String address,Integer userid,String phone,String addressname,String cb){
        Map map=new HashMap();
        Address addressObj=new Address();
        try {
            addressObj.setId(id);
            addressObj.setAddress(address);
            addressObj.setPhone(phone);
            addressObj.setCreaetdate(new Date());
            addressObj.setUpdatedate(new Date());
            addressObj.setUserid(userid+"");
            addressObj.setAddressname(addressname);
            addresssService.updateAddress(addressObj);
            map.put("msg","成功");
            MappingJacksonValue mappingJacksonValue=new MappingJacksonValue(map);
            mappingJacksonValue.setJsonpFunction(cb);
            return mappingJacksonValue;
        } catch (Exception e) {
            e.printStackTrace();
            map.put("msg","失败");
            MappingJacksonValue mappingJacksonValue=new MappingJacksonValue(map);
            mappingJacksonValue.setJsonpFunction(cb);
            return mappingJacksonValue;
        }

    }


    @RequestMapping(value = "/small/address")
    public Object getAddress(Integer id,String cb){
        Map map=new HashMap();
        try {
            Address address = addresssService.getAddress(id);
            MappingJacksonValue mappingJacksonValue=new MappingJacksonValue(address);
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

