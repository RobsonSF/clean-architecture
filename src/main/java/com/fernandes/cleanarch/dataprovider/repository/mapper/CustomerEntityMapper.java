package com.fernandes.cleanarch.dataprovider.repository.mapper;

import com.fernandes.cleanarch.core.domain.Customer;
import com.fernandes.cleanarch.dataprovider.repository.entity.CustomerEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {
    CustomerEntity toCustomerEntity(Customer customer);

    Customer  toCustomer(CustomerEntity customerEntity);
}
