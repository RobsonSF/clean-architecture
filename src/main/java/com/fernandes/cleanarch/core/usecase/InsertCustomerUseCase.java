package com.fernandes.cleanarch.core.usecase;

import com.fernandes.cleanarch.core.domain.Customer;

public interface InsertCustomerUseCase {
    void insert(Customer  customer, String zipCode);
}
