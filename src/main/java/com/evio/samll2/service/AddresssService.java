package com.evio.samll2.Service;

import com.evio.samll2.pojo.Address;

import java.util.List;

public interface AddresssService {

    List<Address> getAddressList(String id);

    void deleteAddressById(Integer id);

    void updateAddress(Address address);

    Address getAddress(Integer id);

    void  addAddress(Address address);
}
