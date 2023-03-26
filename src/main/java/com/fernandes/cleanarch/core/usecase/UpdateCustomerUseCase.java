package com.fernandes.cleanarch.core.usecase;

import com.fernandes.cleanarch.core.domain.Customer;

public interface UpdateCustomerUseCase {
    void update(Customer customer, String zipCode);
}
