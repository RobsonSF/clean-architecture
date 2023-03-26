package com.fernandes.cleanarch.core.dataprovider;

import com.fernandes.cleanarch.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerById {
    Optional<Customer> find(final String id);
}
