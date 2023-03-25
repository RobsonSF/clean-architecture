package com.fernandes.cleanarch.dataprovider.repository;

import com.fernandes.cleanarch.core.dataprovider.FindAddressByZipCode;
import com.fernandes.cleanarch.core.domain.Address;
import com.fernandes.cleanarch.dataprovider.client.FindAddressByZipCodeClient;
import com.fernandes.cleanarch.dataprovider.client.mapper.AddressResponseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeImpl implements FindAddressByZipCode {

    @Autowired
    private FindAddressByZipCodeClient findAddressByZipCodeClient;

    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipCode) {
        var addressResponse = findAddressByZipCodeClient.find(zipCode);
        return addressResponseMapper.toEntity(addressResponse);
    }
}
