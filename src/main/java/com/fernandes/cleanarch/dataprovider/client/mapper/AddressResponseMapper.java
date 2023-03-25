package com.fernandes.cleanarch.dataprovider.client.mapper;

import com.fernandes.cleanarch.core.domain.Address;
import com.fernandes.cleanarch.dataprovider.client.response.AddressResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "Spring")
public interface AddressResponseMapper {
    Address toEntity(AddressResponse addressResponse);
}
