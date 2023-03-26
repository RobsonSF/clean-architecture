package com.fernandes.cleanarch.core.usecase;

import com.fernandes.cleanarch.core.dataprovider.FindCustomerById;
import com.fernandes.cleanarch.core.domain.Customer;

public interface FindCustomerByIdUseCase {
    Customer find(final String id);
}
