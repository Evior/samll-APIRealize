package com.evio.samll2.Service.impl;

import com.evio.samll2.Service.AddresssService;
import com.evio.samll2.mapper.AddressMapper;
import com.evio.samll2.pojo.Address;
import com.evio.samll2.pojo.AddressExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AddressServiceImpl implements AddresssService {
    @Autowired
    public AddressMapper addressMapper;
    @Override
    @Transactional
    public List<Address> getAddressList(String id) {
        AddressExample example=new AddressExample();
        AddressExample.Criteria criteria = example.createCriteria();
        criteria.andUseridEqualTo(id);
        List<Address> addresses = addressMapper.selectByExample(example);
        return addresses;
    }

    @Transactional
    public Address getAddress(Integer id){
        Address address = addressMapper.selectByPrimaryKey(id);
        return address;
    }

    @Override
    @Transactional
    public void addAddress(Address address) {
        int insert = addressMapper.insert(address);
    }

    @Override
    @Transactional
    public void deleteAddressById(Integer id) {
        if (id!=null)
        addressMapper.deleteByPrimaryKey(id);
    }

    @Override
    @Transactional
    public void updateAddress(Address address) {
        addressMapper.updateByPrimaryKeySelective(address);
    }
}
