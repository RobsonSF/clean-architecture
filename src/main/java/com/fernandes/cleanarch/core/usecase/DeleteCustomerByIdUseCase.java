package com.fernandes.cleanarch.core.usecase;

import com.fernandes.cleanarch.core.domain.Customer;

public interface DeleteCustomerByIdUseCase {
    void delete(final String id);
}
