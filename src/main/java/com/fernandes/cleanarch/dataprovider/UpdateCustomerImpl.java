package com.fernandes.cleanarch.dataprovider;

import com.fernandes.cleanarch.core.dataprovider.UpdateCustomer;
import com.fernandes.cleanarch.core.domain.Customer;
import com.fernandes.cleanarch.dataprovider.repository.CustomerRepository;
import com.fernandes.cleanarch.dataprovider.repository.mapper.CustomerEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Component
public class UpdateCustomerImpl implements UpdateCustomer {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void update(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }
}
