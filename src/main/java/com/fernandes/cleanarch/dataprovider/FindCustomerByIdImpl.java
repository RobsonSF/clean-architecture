package com.fernandes.cleanarch.dataprovider;

import com.fernandes.cleanarch.core.dataprovider.FindCustomerById;
import com.fernandes.cleanarch.core.domain.Customer;
import com.fernandes.cleanarch.dataprovider.repository.CustomerRepository;
import com.fernandes.cleanarch.dataprovider.repository.mapper.CustomerEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class FindCustomerByIdImpl implements FindCustomerById {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public Optional<Customer> find(String id) {
        var  customerEntity = customerRepository.findById(id);
        return customerEntity.map(customerEntityMapper::toCustomer);
    }
}
