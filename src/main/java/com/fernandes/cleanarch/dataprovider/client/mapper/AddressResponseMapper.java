package com.fernandes.cleanarch.dataprovider.client.mapper;

import com.fernandes.cleanarch.core.domain.Address;
import com.fernandes.cleanarch.dataprovider.client.response.AddressResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {
    Address toAddress(AddressResponse addressResponse);
}
