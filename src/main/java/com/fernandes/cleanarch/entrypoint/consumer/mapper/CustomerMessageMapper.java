package com.fernandes.cleanarch.entrypoint.consumer.mapper;

import com.fernandes.cleanarch.core.domain.Customer;
import com.fernandes.cleanarch.entrypoint.consumer.message.CustomerMessage;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMessageMapper {
    Customer toCostumer(CustomerMessage  customerMessage);
}
